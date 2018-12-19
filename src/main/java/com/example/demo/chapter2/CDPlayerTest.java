package com.example.demo.chapter2;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
// 导入静态类
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;


    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }
}
