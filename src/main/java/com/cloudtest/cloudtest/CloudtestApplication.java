package com.cloudtest.cloudtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cloudtest.cloudtest.mapper")
public class CloudtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudtestApplication.class, args);
    }
}
