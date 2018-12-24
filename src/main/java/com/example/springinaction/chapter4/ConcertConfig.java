package com.example.springinaction.chapter4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
// 启用AspectJ自动代理
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

    @Bean
    // 声明Audience bean
    public Audience audience(){
        return new Audience();
    }



}
