package com.example.springinaction.chapter3.dessert;

import com.example.springinaction.chapter3.dessert.Annot.Cold;
import com.example.springinaction.chapter3.dessert.Annot.Creamy;
import org.springframework.stereotype.Component;

@Component
// @Primary
// 自定义限定符号
// 优点是可以所以重构
//@Qualifier("cold")

@Cold
@Creamy
public class IceCream implements Dessert {
    @Override
    public void eat() {
        System.out.println("IceCream");
    }
}
