package com.chengy.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("com.chengy.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient//服务注册
public class ShoppingMallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallCouponApplication.class, args);
    }

}
