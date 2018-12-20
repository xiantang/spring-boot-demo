package com.example.springinaction.chapter3;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MagicConfig {


    @Bean
    // 实现来Condition的接口
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicConfig(){
        return new MagicBean();
    }
}
