package com.lanhangbao.mysql.ecable.mysql;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Created with IntelliJ IDEA
 * @Description: 动态数据源：返回拦截后输出的结果
 * @Package: com.dao.split
 * @author: FLy-Fly-Zhang
 * @Date: 2020/2/10
 * @Time: 12:14
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceHolder.getDbType();
    }
}
