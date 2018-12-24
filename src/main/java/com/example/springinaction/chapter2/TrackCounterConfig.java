package com.example.springinaction.chapter2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy  //启动AspectJ自动代理
public class TrackCounterConfig {


    @Bean
    public  CompactDisc sgtPeppers(){
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Pepper's Lonely");
        cd.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("sadad");
        tracks.add("dasdasd");
        tracks.add("dasdqwd");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
