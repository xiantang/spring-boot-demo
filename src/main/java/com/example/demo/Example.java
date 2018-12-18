package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// belong to
@RestController // tells Spring to render the resulting string directly back to the caller.
// 在没有配置数据库会报错   排除数据库依赖的情况下使用
// 如果不要使用某个配置 使用exclue 进行配置 you can use the exclude attribute of @EnableAutoConfiguration to disable them
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Example {
    @RequestMapping("/") // provides “routing” information
    public String home(){
//        System.out.println("aaaaaa");
        return "Hello world";

    }

    public static void main(String[] args) throws Exception{

        SpringApplication.run(Example.class,args);
    }


}
