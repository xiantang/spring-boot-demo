package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import spittr.data.JdbcSpitterRepository;
import spittr.data.SpitterRepository;

import javax.sql.DataSource;
@Configuration
public class JdbcConfig {
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl("jdbc:mysql://111.231.255.225:3306/db_example");
//        ds.setUsername("root");
//        ds.setPassword("123456zjd");
//
//        return ds;
//    }
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//    //
////
//    @Bean
//    public SpitterRepository jdbcSpitterRepository(JdbcTemplate jdbcTemplate){
//        return new JdbcSpitterRepository(jdbcTemplate);
//    }

    @Bean
    public 

}
