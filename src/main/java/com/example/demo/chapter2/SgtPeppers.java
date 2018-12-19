package com.example.demo.chapter2;


import org.springframework.stereotype.Component;

// 告诉Spring为这个类创建bean
//@Component()
@Component("lonelyHeartsClub")

public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
