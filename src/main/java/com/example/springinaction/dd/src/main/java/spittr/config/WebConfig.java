package spittr.config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc  //启用SpringMVC
@ComponentScan("spittr.config") // 组件扫描
public class WebConfig extends WebMvcConfigurerAdapter {


    // 配置JSP视图解析器

    @Bean
    public ViewResolver viewResolver(){
        /**
         * 使用 /WEB-INF 和 .jsp 前后缀来确定JSP文件的物理位置
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

    // 配置静态资源的处理
    // 对静态资源请求转发到默认的Servlet上
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
