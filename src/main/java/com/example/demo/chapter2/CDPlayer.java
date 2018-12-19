package com.example.demo.chapter2;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

//    public static void main(String[] args) {
//        CDPlayer cdPlayer = new CDPlayer()
//    }
}
