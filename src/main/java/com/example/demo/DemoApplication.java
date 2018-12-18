package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


// @SpringBootApplication
// @SpringBootApplication is same as @Configuration
// @EnableAutoConfiguration @ComponentScan
@Configuration
@EnableAutoConfiguration
// 去查找当前目录下的模块 和 @ComponentScan相当
@Import({Example.class})

public class DemoApplication {

    public static void main(String[] args) {
//        System.out.println("aaaaa");
        SpringApplication.run(DemoApplication.class, args);
    }
}
