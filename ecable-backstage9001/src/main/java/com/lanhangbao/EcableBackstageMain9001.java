package com.lanhangbao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EcableBackstageMain9001 {
    public static void main(String[] args) {

        SpringApplication.run(EcableBackstageMain9001.class, args);
    }
}