package com.example.demo.chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        // 从一个类路径下或者多个XML中家在一个上下文定义
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext(
//                        "knight.xml"
//                );

        ApplicationContext context = new AnnotationConfigApplicationContext(
                KnightConfig.class
        );
        //  获取一个人ID为knight的bean
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
//        context.close();
    }


}
