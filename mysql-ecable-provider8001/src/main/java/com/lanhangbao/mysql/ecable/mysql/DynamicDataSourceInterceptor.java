package com.lanhangbao.mysql.ecable.mysql;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.keygen.SelectKeyGenerator;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import java.util.Locale;
import java.util.Properties;

/*动态数据拦截器*/
/**
 * @Created with IntelliJ IDEA
 * @Description: mybatis拦截器
 * 用来拦截sql信息，并通过判断返回使用主从库
 * @Package: com.dao.split
 * @author: FLy-Fly-Zhang
 * @Date: 2020/2/10
 * @Time: 12:49
 */
//mybatis会将增删改的操作封装在update里面，select封装在query里面
// 需要拦截的方法所在的类，方法名，参数，返回值
@Intercepts({@Signature(type = Executor.class,method = "update",args={MappedStatement.class,Object.class}),
        @Signature(type = Executor.class,method = "query",
                args={MappedStatement.class,Object.class,RowBounds.class,ResultHandler.class})})
public class DynamicDataSourceInterceptor implements Interceptor {
    private Logger logger=LoggerFactory.getLogger(DynamicDataSourceInterceptor.class);
    //\u0020 空格 判断字符串是不是这三个字符打头
    private static final String REGEX=".*insert\\u0020.*|.*delete\\u0020.*|.*update\\u0020.*";
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //判断当前操作是不是事务的
        boolean synchronizationActive = TransactionSynchronizationManager.isActualTransactionActive();
        String lookupKey=DynamicDataSourceHolder.DB_MASTER;;
        Object[] objects=invocation.getArgs(); //获取sql参数
        MappedStatement mappedStatement = (MappedStatement)objects[0]; //objectsz中第一个参数就用来确定是CRUD
        //System.out.println(synchronizationActive);
        //不是事务
        if(!synchronizationActive){
            //读方法
            if(mappedStatement.getSqlCommandType().equals(SqlCommandType.SELECT)){
                //selectKey 为自增id查询主键即(select LAST_INSERT_ID()) 方法，使用主库查询
                //一般我们插入数据返回自增主键时就调用select LAST_INSERT_ID()方法，插入时为主库，
                // 查询时若切换则会导致数据发生错误
                if(mappedStatement.getId().contains(SelectKeyGenerator.SELECT_KEY_SUFFIX)){
                    //lookupKey=DynamicDataSourceHolder.DB_MASTER;
                }else{
                    //绑定sql  objects[1]第二个参数就是sql
                    BoundSql boundSql=mappedStatement.getSqlSource().getBoundSql(objects[1]);
                    String sql=boundSql.getSql().toLowerCase(Locale.CHINA) //sql转换为中国时区
                            //将所有的制表符，换行符，回车替换为空格==>将sql变为一行
                            .replaceAll("\\t\\n\\r"," ");
                    //正则表达式匹配
                    if(sql.matches(REGEX)){
                        //lookupKey=DynamicDataSourceHolder.DB_MASTER;
                    }else{
                        lookupKey=DynamicDataSourceHolder.DB_SLAVE;
                    }
                }
            }
        }
        //else{ //事务类，都会改数据
            //lookupKey=DynamicDataSourceHolder.DB_MASTER;
        //}
        //[{}] 占位符，用来替换后面的参数
        logger.debug("设置方法[{}] use[{}]Strategy,SqlCommonType[{}]..",
                mappedStatement.getId(),
                lookupKey,
                mappedStatement.getSqlCommandType().name());
        DynamicDataSourceHolder.setDbtype(lookupKey);
        //System.out.println("h1");
        return invocation.proceed(); //结束拦截，程序继续进行
    }

    /**
     * 拦截配置
     * @param o
     * @return
     */
    @Override
    public Object plugin(Object o) {
        //如果拦截的对象是Executor类型的，就进行拦截
        //Executor 在mybatis中做CRUD操作
        if(o instanceof Executor)
            return Plugin.wrap(o,this);

        return o;
    }
    @Override
    public void setProperties(Properties properties) {
    }
}