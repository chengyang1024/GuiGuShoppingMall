package com.chengy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.chengy.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingMallMenberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallMenberApplication.class, args);
    }

}
