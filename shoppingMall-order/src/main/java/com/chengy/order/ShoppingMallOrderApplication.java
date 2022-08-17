package com.chengy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@MapperScan("com.chengy.order.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.chengy.order.feign")//消费者开启feign注解
public class ShoppingMallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallOrderApplication.class, args);
    }

}
