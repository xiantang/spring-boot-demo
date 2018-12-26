package spittr.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import spittr.data.Spitter;

import spittr.data.Spittle;
import spittr.data.SpitterRepository;

import javax.servlet.http.Part;
import javax.validation.Valid;

@Controller
@RequestMapping("/spitter")
public class SpitterContoller {

    @Autowired
    private SpitterRepository spitterRepository;


    @RequestMapping(value = "/register", method = RequestMethod.GET)

    public String showRegistrationForm(Model model){
        /**
         * 根据对对象类型推断出来spitter
         * @date 2018/12/26
         * @params [model]
         * @return java.lang.String
         **/
        model.addAttribute(new Spitter());
        return "registerForm";
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(
            @RequestPart(name = "profilePicture",required = false) Part profilePicture,
            @Valid Spitter spitter,
            Errors errors
    ) {
//        profilePicture.write();
//        if (errors.hasErrors()) {
//            return "registerForm";
//        }
//        try {
//            profilePicture.write("/Users/dd/project/demo/src/main/java/com/example/springinaction/dd/src/main/webapp/WEB-INF/uploads" + profilePicture.getName());
//        }catch (Exception e ){
//
//

        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();

    }


}
