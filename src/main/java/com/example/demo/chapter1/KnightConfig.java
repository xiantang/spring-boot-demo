package com.example.demo.chapter1;


import org.aspectj.lang.annotation.After;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest(), minstrel());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
    @Bean
    public Minstrel minstrel(){
        return new Minstrel(System.out);
    }


//    void dd(){
//        JdbcTemplate jd = new JdbcTemplate();
//        jd.query("", new RowMapper<Object>() {
//            @Override
//            public Object mapRow(ResultSet resultSet, int i) {
//                return null;
//            }
//        });
//    }
}
