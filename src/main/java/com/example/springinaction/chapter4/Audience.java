package com.example.springinaction.chapter4;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;


//　切面
//@Aspect
public class Audience {

//    @Pointcut("execution(**cencert.Performance.perform(..)))")
//    public void performance(){}

    @Pointcut("execution(* Performance.perform(..))")
    public void performance(){}

    // 在表演之前
    // 在perform方法执行的时候执行
//    @Before("execution(**cencert.Performance.perform(..))")
//    public void silenceCellPhone(){
//        System.out.println("Silenceing cell phones");
//    }

    // 表演之前
//    @Before("execution(**cencert.Performance.perform(..))")
//    public void takeSeats(){
//        System.out.println("Taking seats");
//
//    }

    // 表演之后
//    @AfterReturning("execution(**cencert.Performance.perform(..)))")
//    public void applause(){
//        System.out.println("CLAP CLAP CLAP");
//    }


    // 异常抛出后执行
    // 表演失败之后
//    @AfterThrowing("execution(**cencert.Performance.perform(..))))")
//    public void demandRefund(){
//        System.out.println("Demanding a refund");
//    }

    // Pointcut 注解是设置一个切点表达式
    // 定义命名的切点
//    @Pointcut("execution(**cencert.Performance.perform(..))")
//    public void performance(){
//        // 实际内容不重要
//        // 提供一个标识
//    }

//    @Before("performance()")
    public void slienceCallphones(){
        System.out.println("Sliencing cell phones");
    }
//
//    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seat");
    }
//
//    // 表演之后
//    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }

//    @Around("per")
//    public void watchPerformance(ProceedingJoinPoint jp){
//
//        try {
//            System.out.println("Silencing cell phones");
//            System.out.println("Taking seats");
//            jp.proceed();
//            System.out.println("CLAP CLAP CLAP");
//        } catch (Throwable throwable) {
//            System.out.println("Demanding a refund");
//        }
//
//    }


//
//
//    // 异常抛出后执行
//    // 表演失败之后
//    @AfterThrowing("performance()")
//    public void demandRefund(){
//        System.out.println("Demanding a refund");
//    }

    // Around 注解表明
    // watchPerformance()方法会作为performance()切点的环绕通知
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("Sliencing cell phone");
            System.out.println("Taking seats");
            // 当要将控制权交给被通知的方法时候
            // 调用
            jp.proceed();
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }

    }

}
