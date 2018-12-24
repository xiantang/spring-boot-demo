package com.example.springinaction;


import com.example.springinaction.chapter2.SoundSystemConfig;
import com.example.springinaction.chapter3.dessert.Cookie;
import com.example.springinaction.chapter4.Audience;
import com.example.springinaction.chapter4.ConcertConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)

// 使用javaConfig
@ContextConfiguration(classes = ConcertConfig.class)

public class ConcertTest {
    @Autowired
    private Audience audience;

    @Test
    public void cdShouldNotBeNull() {

        assertNotNull(audience);
    }
}
