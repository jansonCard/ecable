package com.lanhangbao.mysql.ecable.mysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*动态数据保持器*/
public class DynamicDataSourceHolder {
	private static Logger logger=LoggerFactory.getLogger(DynamicDataSourceHolder.class);
    //线程本地变量
    //ThreadLocal为变量在每个线程中都创建了一个副本，那么每个线程可以访问自己内部的副本变量
    private static ThreadLocal<String> contextHolder=new ThreadLocal<>();
    public static final String DB_MASTER="master";
    //若是多个从库，这里可以变为一个常量数组，在返回slave的地方使用random随机取
    public static final String DB_SLAVE="slave1";
    //获取线程的DBType
    public static String getDbType(){
        String db=contextHolder.get();
        if(db==null){
            db=DB_MASTER;
        }
        return db;
    }
    //设置线程的dbType
    public static void setDbtype(String db){
        logger.debug("所使用的数据源为 + " + db);
        //System.out.println("所使用的数据源为 + " + db);
        //System.out.println(CommonFunction.getRandom(1, 3));
        contextHolder.set(db);
    }
    //清理连接类型
    public static void clearDBType(){
        contextHolder.remove();
    }
}
