package com.example.springinaction;


import com.example.springinaction.chapter2.CompactDisc;
import com.example.springinaction.chapter2.TrackCounter;
import com.example.springinaction.chapter2.TrackCounterConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Rule
    public final StandardOutputStreamLog log =
            new StandardOutputStreamLog();

//    @Au
    @Autowired
    private CompactDisc cd;


    @Autowired
    private TrackCounter counter;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void counterShouldNotBeNull(){
        assertNotNull(counter);
//        counter
    }
    @Test
    public void testTrackCountr(){
        cd.playTrack(1);
      assertEquals(1, counter.getPlayCount(1));


    }

}
