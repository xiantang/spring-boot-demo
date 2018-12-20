package com.example.springinaction.chapter2;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
// 将两个类组合在一起
//@Import({CDPlayerConfig.class,CDConfig.class})


// 分别采用xml配置和javaConfig
@Import({CDPlayerConfig.class})
@ImportResource("classpath:chapter2/player.xml")
public class SoundSystemConfig {

}
