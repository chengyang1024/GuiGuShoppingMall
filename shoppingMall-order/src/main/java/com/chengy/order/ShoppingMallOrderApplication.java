package com.chengy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("com.chengy.order.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingMallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallOrderApplication.class, args);
    }

}
