package com.lanhangbao.mysql.ecable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auther zzyy
 * @create 2020-02-17 21:13
 */
@SpringBootApplication
@MapperScan(value="com.lanhangbao.mysql.ecable.dao")
public class MysqlEcableProviderMain8001
{
    public static void main(String[] args) {
        SpringApplication.run(MysqlEcableProviderMain8001.class, args);
    }
}
