package com.example.springinaction.chapter1;

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
