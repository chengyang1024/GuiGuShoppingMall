package com.chengy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.chengy.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.chengy.member.feign")//消费者开启feign注解
public class ShoppingMallMenberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallMenberApplication.class, args);
    }

}
