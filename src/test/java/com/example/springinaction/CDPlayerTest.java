package com.example.springinaction;

import com.example.springinaction.chapter2.CompactDisc;
import com.example.springinaction.chapter2.MediaPlayer;
import com.example.springinaction.chapter2.SoundSystemConfig;
import org.junit.Rule;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

// 使用javaConfig
 @ContextConfiguration(classes = SoundSystemConfig.class)

// 设置xml
//@ContextConfiguration(locations = {"classpath:chapter2/rootconfig.xml"})
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;


    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles",
                player.play());
    }
}
