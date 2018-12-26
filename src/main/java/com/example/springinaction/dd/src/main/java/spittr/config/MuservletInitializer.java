package spittr.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.*;

public class MuservletInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        ServletRegistration.Dynamic myServlet =
//                // 注册servlet
//                servletContext.addServlet("myServlet", Myservle.class);
//        // 映射servlet
//        myServlet.addMapping("/custom/***");
//    }


    @Override
    public void onStartup(ServletContext servletContext) {
//        FilterRegistration.Dynamic filter =
//                servletContext.addFilter("myFilter", MyFilter.class);
//        filter.addMappingForUrlPatterns(null,false,"/custom/**");
    }

}
