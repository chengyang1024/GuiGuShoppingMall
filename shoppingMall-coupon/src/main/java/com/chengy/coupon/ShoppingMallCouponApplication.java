package com.chengy.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chengy.coupon.dao")
@SpringBootApplication
public class ShoppingMallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallCouponApplication.class, args);
    }

}
