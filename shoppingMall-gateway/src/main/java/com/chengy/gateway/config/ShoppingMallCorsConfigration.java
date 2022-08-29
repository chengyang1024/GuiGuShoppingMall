package com.chengy.gateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;


/**
 * 用来解决跨域问题
 * 在响应头里面加一系列请求头
 */

@Configuration
public class ShoppingMallCorsConfigration {


    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许的请求头
        corsConfiguration.addAllowedHeader("*");
        // 允许的请求源 （如：http://localhost:8080）
        corsConfiguration.addAllowedOrigin("*");
        // 允许的请求方法 ==> GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE
        corsConfiguration.addAllowedMethod("*");
        //是否携带cookie跨域
        corsConfiguration.setAllowCredentials(true);
        // URL 映射 （如： /admin/**）
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter( urlBasedCorsConfigurationSource);
    }

}
