package com.example.springinaction.chapter2;

import org.springframework.context.annotation.Configuration;

// 没有显式的声明任何bean
// 启用组件扫描
// 查找带有Component注解的类
@Configuration
// @ComponentScan
// 扫描指定包
// 使用basePackages 清晰表面你所设置的是基础包
// 可以添加设置多个基础包
// 但是是类型不安全的
// 重构代码的时候可能会出现类型错误
// @ComponentScan(basePackages = "com.example.springinaction.chapter2")

// 推荐使用
// 将其指定为包中含有的类或者接口
//@ComponentScan(basePackageClasses = CDPlayer.class)


public class CDPlayerConfig {
    // 显式配置
    //    @Bean
    // 指定名字
//    @Bean
//    public CompactDisc sgtPeppers(){
//        return new SgtPeppers();
//    }


    // 默认情况下
    // Spring bean 是单例的
    // Spring会拦截sgtPeppers()的调用
    // 确保返回的是Spring所创建的bean
//    @Bean
//    public MediaPlayer cdPlayer(){
//        return new CDPlayer(sgtPeppers());
//    }

    // 调用cdPlayer的时候
    // 创建CDPlayerbean的时候
    // 会自动装配一个CompactDisc到配置方法当中

    // 带有@Bean 注解的方法可以采用任何java
    // 必要的功能来产生bean实例
//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc){
//        return new CDPlayer(compactDisc);
//    }



}
