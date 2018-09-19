package com.example.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: ffq
 * @Description:zuul不只是只有路由功能，还有过滤功能（可以做一些安全验证）
 * @Date: Create in 17:02 2018/6/12
 */
@SpringBootApplication
@EnableEurekaClient
//开启zuul ，基本有路由的功能
@EnableZuulProxy
public class ServiceZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }
}
