package com.example.demo.chapter2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 没有显式的声明任何bean
// 启用组件扫描
// 查找带有Component注解的类
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
