package com.example.springinaction.chapter4;

public class CriticismEngineImpl  implements CriticismEngine{
    public CriticismEngineImpl(){}


    // 表演结束的时候调用下面的方法
    // 来发表一个苛刻的评论
    @Override
    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }


    // 为了不产生不必要的耦合
    // injected
    private String[] criticismPool;
    @Override
    public void setCriticismPool(String[] criticismPool){
        this.criticismPool = criticismPool;
    }

}
