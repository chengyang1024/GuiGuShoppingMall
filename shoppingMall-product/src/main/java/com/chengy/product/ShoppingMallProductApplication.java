package com.chengy.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 1.整合mybatisplus（导入依赖）
 * 2.配置数据源yml文件(导入mysql依赖)
 * 3.配置mybatisplus
 *  1）.使用MapperScan
 *  2）.如果使用复杂sql则需要mapper.xml文件(yml配置mapper-localtions路径)
 * 4.配置主键自增
 */
@MapperScan("com.chengy.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.chengy.product.feign")//消费者开启feign注解
public class ShoppingMallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallProductApplication.class, args);
    }

}
