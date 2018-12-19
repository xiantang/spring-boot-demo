package com.example.demo.chapter1;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public  SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    // 实现了embark接口 就适合注入到BraveKnight中去了
    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon");
    }
}
