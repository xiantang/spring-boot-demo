package spittr.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import spittr.data.JdbcSpitterRepository;
import spittr.data.SpitterRepository;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@EnableWebMvc  //启用SpringMVC
@ComponentScan("spittr.config") // 组件扫描
public class WebConfig extends WebMvcConfigurerAdapter {


    // 配置JSP视图解析器

    @Bean
    public ViewResolver viewResolver() {
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
        // 解析为JSTLView
        resolver.setViewClass(
                org.springframework.web.servlet.view.JstlView.class
        );

        return resolver;
    }

    // 配置静态资源的处理
    // 对静态资源请求转发到默认的Servlet上
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }


    @Bean
    public MessageSource messageSource() {
        /**
         *
         * @date 2018/12/26
         * @params []
         * @return org.springframework.context.MessageSource
         **/
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("/WEB-INF/message");
        messageSource.setCacheSeconds(10);
        return messageSource;
    }

    //    @Bean
//    public JndiObjectFactoryBean dataSource(){
//        JndiObjectFactoryBean jndiObjectFB = new JndiObjectFactoryBean();
//        jndiObjectFB.setJndiName("jdbc/SpittrDS");
//        jndiObjectFB.setResourceRef(true);
//        jndiObjectFB.setProxyInterfaces(javax.sql.DataSource.class);
//        return jndiObjectFB;
//    }


//    @Bean
//    public MultipartResolver multipartResolver() throws IOException {
//
//
////        return new StandardServletMultipartResolver();
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//        multipartResolver.setUploadTempDir(
//                new FileSystemResource(
//                        "/Users/dd/project/demo/src/main/java/com/example/springinaction/dd/src/main/webapp/WEB-INF/uploads"
//                )
//        );
//        multipartResolver.setMaxInMemorySize(0);
//        multipartResolver.setMaxUploadSize(2097152);
//        return multipartResolver;
//    }
//    @Bean
//    public TilesConfigurer tilesConfigurer() {
//        TilesConfigurer tiles = new TilesConfigurer();
//        // 指定Tile 定义的位置
//        tiles.setDefinitions(new String[]{
//                "/WEB-INF/**/tiles.xml"
//        });
//        tiles.setCheckRefresh(true);
//        return tiles;
//
//    }


//    @Bean
//    public ViewResolver viewResolver(){
//            return new TilesViewResolver();
//    }


}
