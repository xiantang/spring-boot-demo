package com.example.springinaction.chapter3.dessert;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Cake implements Dessert {
    @Override
    public void eat() {
        System.out.println("cake");
    }
}
