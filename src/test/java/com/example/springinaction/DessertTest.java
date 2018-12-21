package com.example.springinaction;

import com.example.springinaction.chapter2.MediaPlayer;
import com.example.springinaction.chapter2.SoundSystemConfig;
import com.example.springinaction.chapter3.dessert.Cookie;
import com.example.springinaction.chapter3.dessert.Dessert;
import com.example.springinaction.chapter3.dessert.DessertConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)

// 使用javaConfig
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {

    @Autowired
    // 设置的参数就是注入bean中的ID
    @Qualifier("cookie")

    private Dessert dessert;

//    @Autowired
//    private Dessert cookie;


    @Test
    public void cdShouldNotBeNull() {

       Cookie cookie= (Cookie)dessert;

        assertNotNull(cookie.getDessert());
        cookie.getDessert().eat();
    }

}
