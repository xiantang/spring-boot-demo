package com.example.springinaction.chapter3.dessert;


import com.example.springinaction.chapter3.dessert.Annot.Cold;
import com.example.springinaction.chapter3.dessert.Annot.Creamy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cookie implements Dessert{
    private Dessert dessert;
    @Override
    public void eat() {
        System.out.println("cookie");
    }

    @Autowired
//    @Qualifier("creamy")
    @Cold
    @Creamy
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }

    public Dessert getDessert(){
        return dessert;
    }
}

