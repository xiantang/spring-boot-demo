package com.example.demo.chapter1;

import com.example.demo.chapter1.Knight;

public class DamselRescuingKnight implements Knight {

    private Quest quest;
    public DamselRescuingKnight(){
        this.quest = new Quest(){
            @Override
            public void embark() {

            }
        };
    }
    public void  embarkOnQuest(){
        quest.embark();
    }
}
