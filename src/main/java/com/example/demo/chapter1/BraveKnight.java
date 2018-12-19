package com.example.demo.chapter1;

public class BraveKnight implements Knight {
    private Quest quest;
    private Minstrel minstrel;
    // quest 注入进来
    // 构造注入
    public BraveKnight(Quest quest,Minstrel minstrel){
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkOnQuest(){
//        minstrel.singAfterQuest();
        quest.embark();
//        minstrel.singBeforeQuest();

    }
}
