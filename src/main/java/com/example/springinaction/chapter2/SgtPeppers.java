package com.example.springinaction.chapter2;


import org.springframework.stereotype.Component;

// 告诉Spring为这个类创建bean
@Component()
//@Component("lonelyHeartsClub")

public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public String play() {
        return (String)"Playing " + title + " by " + artist;
    }

    @Override
    public void playTrack(int trackNumber) {

    }
}
