package com.example.springinaction.chapter3.dessert;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("creamy")
public class Popsicle implements Dessert {
    @Override
    public void eat() {
        System.out.println("Popsicle");
    }
}
