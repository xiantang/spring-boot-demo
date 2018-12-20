package com.example.springinaction.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// @SpringBootApplication
// @SpringBootApplication is same as @Configuration
// @EnableAutoConfiguration @ComponentScan
@Configuration
@EnableAutoConfiguration
// 去查找当前目录下的模块 和 @ComponentScan相当
@Import({Example.class, MainController.class})
@EnableJpaRepositories
@ComponentScan
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
//        SpringApplication app = new SpringApplication(DemoApplication.class);
//        app.setBannerMode(Banner.Mode.CONSOLE);
//        app.run(args);
//        new SpringApplicationBuilder()
//                .sources(Parent.class)
//                .child(DemoApplication.class)
//                .bannerMode(Banner.Mode.CONSOLE)
//                .run(args);
        SpringApplication.run(DemoApplication.class, args);
    }
}
