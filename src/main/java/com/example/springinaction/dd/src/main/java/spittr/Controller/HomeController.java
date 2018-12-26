package spittr.config.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 是一个构造型注解
// 基于@Component

@Controller
// 方法能够映射到'/' 和 '/homepage'
@RequestMapping(value = {"/","/homepage"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        // 返回的home 将会被SpringMVC 解读为要渲染的视图名称
        // 视图名"home"将会解析为/WEB-INF/views/home.jsp
        return "home";
    }

}
