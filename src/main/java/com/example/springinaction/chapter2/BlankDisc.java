package com.example.springinaction.chapter2;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;


//    public BlankDisc(String title, String artist,List<String> tracks) {
//        this.tracks = tracks;
//        this.title = title;
//        this.artist = artist;
//    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String play() {
        for(String track :tracks)
            System.out.println("-Track: "+track);
        return "Playing " + title + " by " + artist;
    }
}
