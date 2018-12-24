package com.example.springinaction.chapter3;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class MagicConfig {


    @Bean
    // 实现来Condition的接口
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicConfig(){
        return new MagicBean();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }


}
