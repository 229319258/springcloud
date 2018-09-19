package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer//开启配置服务器功能
public class ConfigserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigserverApplication.class, args);
    }
}
