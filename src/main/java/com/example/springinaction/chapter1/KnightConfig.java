package com.example.springinaction.chapter1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
