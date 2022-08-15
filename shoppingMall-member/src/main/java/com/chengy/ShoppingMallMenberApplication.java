package com.chengy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chengy.member.dao")
@SpringBootApplication
public class ShoppingMallMenberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallMenberApplication.class, args);
    }

}
