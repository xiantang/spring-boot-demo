package com.example.springinaction.chapter2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.EnvironmentCapable;


@Configuration
// 声明属性源
@PropertySource("classpath:chapter2/app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc disc(){
        // 检索属性值

        return new BlankDisc(
            //使用默认值
                env.getProperty("disc.title","Rattle and Hum"),
                env.getProperty("disc.artist","U2")
        );
//        return new BlankDisc(
//                //使用默认值
//                env.getRequiredProperty("disc.title"),
//                env.getRequiredProperty("disc.artist")
//        );
    }

}
