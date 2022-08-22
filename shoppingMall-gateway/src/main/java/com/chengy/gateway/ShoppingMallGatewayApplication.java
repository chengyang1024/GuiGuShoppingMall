package com.chengy.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//服务注册
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})//mybatis坐标引用，如果没有配置数据库，此注解可以排除报错
public class ShoppingMallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallGatewayApplication.class, args);
    }

}
