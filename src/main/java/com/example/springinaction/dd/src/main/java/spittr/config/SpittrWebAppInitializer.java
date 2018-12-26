package spittr.config.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 将一个或者多个路径映射到DispatcherServlet 上
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //  返回带有@Configurations注解的类 来配置@ContextLoaderListeneer
    //  创建的应用上下文中的bean
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class<?>[]{
                RootConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        // 使用定义分WebConfig配置类
        return new Class<?>[]{
                WebConfig.class
        };
    }


}
