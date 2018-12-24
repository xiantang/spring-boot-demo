package com.example.springinaction.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
    private CompactDisc cd;

    // 自动装配
    // 在构造器上添加@Autowired注解
    // 表明当Spring创建bean的时候
    // 会通过这个构造器实例化并且传入一个可设置的bean
     @Autowired
    // 如果没有匹配的bean
    // 就会抛出一个异常
    // 为了避免异常
//    @Autowired(required = false)
    public  CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    // 属性的setter上的应用
    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }

    public String play() {
        return cd.play();
    }

//    public static void main(String[] args) {
//        CDPlayer cdPlayer = new CDPlayer()
//    }
}
