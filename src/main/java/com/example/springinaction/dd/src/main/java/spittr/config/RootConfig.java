package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import spittr.data.SpittleRepository;

@Configuration
@ComponentScan(basePackages = "spittr",
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,
                        value = EnableWebMvc.class

                )
        }


)
public class RootConfig {
//    @Bean
//    public SpittleRepository spittleRepository(){
//        return new
//    }
}
