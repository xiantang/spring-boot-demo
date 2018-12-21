package com.example.springinaction.chapter3;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// 通过@Scope申明原形bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notpad {
    public Notpad() {
    }
}
