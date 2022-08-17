package com.chengy.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@MapperScan("com.chengy.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient//服务注册
@EnableFeignClients(basePackages = "com.chengy.coupon.feign")//消费者开启feign注解
public class ShoppingMallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallCouponApplication.class, args);
    }

}
