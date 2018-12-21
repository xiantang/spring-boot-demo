package com.example.springinaction.chapter3.dessert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DessertConfig {
    // 记住最基本的依赖要写在最上面

    @Bean
    public Dessert popsicle(){
        return new Popsicle();
    }

    @Bean
    // 通过javaConfig 显式配置
//    @Primary
    public Dessert iceCream(){
        return new IceCream();
    }


    @Bean
    public Dessert cookie(){
        return new Cookie();
    }




}
