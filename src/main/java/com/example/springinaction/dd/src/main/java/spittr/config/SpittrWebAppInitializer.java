package spittr.config;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;


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

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        /**
         * 处理文件上传
         * @date 2018/12/26
         * @params [registration]
         * @return void
         **/
//        DispatcherServlet ds = new DispatcherServlet();
//        ServletRegistration.Dynamic registration
        registration.setMultipartConfig(
                new MultipartConfigElement("/Users/dd/project/demo/src/main/java/com/example/springinaction/dd/src/main/webapp/WEB-INF/views",
                        2097152, 4194304, 0)
        );
    }
//
//    @Override
//    protected Filter[] getServletFilters() {
//        return super.getServletFilters();
//    }
}
