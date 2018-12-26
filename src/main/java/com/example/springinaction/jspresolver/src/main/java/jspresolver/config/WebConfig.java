package jspresolver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig {
    @Bean
    public ViewResolver viewResolver() {
        /**
         * 将视图名字解析为JSP
         * 如果你使用了JSP标准标签库
         * 能够将视图解析为JstlView形式的文件
         * @date 2018/12/26
         *
         * @return org.springframework.web.servlet.ViewResolver
         **/
        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;


    }


}
