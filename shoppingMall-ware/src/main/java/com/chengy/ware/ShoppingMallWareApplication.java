package com.chengy.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chengy.ware.dao")
@SpringBootApplication
public class ShoppingMallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallWareApplication.class, args);
    }

}
