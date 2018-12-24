package com.example.springinaction.chapter2;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

//　切面
@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts =
            new HashMap<>();



    // 通知playTrack()方法
    // * 返回任意类型
    // CompactDisc.playTrack(int)
    // args(trackNumber) 参数
//    @Pointcut(
//    "execution(* CompactDisc.playTrack(int))"+
//            "&& args(trackNumber)"
//    )
//    public void trackPlayed(int trackNumber){}

    

//
//    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);

    }

    public int getPlayCount(int trackNumber) {

        return trackCounts.containsKey(trackNumber)
                ? trackCounts.get(trackNumber):0;


    }


}
