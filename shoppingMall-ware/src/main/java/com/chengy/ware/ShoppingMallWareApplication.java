package com.chengy.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.chengy.ware.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingMallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallWareApplication.class, args);
    }

}
