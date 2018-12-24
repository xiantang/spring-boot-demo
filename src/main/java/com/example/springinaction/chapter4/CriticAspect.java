package com.example.springinaction.chapter4;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CriticAspect {
    public CriticAspect() {
    }

    @Pointcut("execution(* performance())")
    public void performance() {
    }

    @AfterReturning("performance()")
    public void performanceEnd() {
//        System.out.println();
    }

    private CriticismEngine criticismEngine;


    // 注入引擎
    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;

    }

}
