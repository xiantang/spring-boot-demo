package com.example.springinaction.chapter2;

import org.springframework.context.annotation.Bean;

public class CDConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }


}
