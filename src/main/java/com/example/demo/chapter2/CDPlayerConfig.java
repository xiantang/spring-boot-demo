package com.example.demo.chapter2;

import org.springframework.context.annotation.ComponentScan;
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
// @ComponentScan(basePackages = "com.example.demo.chapter2")

// 推荐使用
// 将其指定为包中含有的类或者接口
@ComponentScan(basePackageClasses = CDPlayer.class)
public class CDPlayerConfig {
}
