package spittr.config.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.config.data.Spittle;
import spittr.config.data.SpittleRepository;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/spittles")

public class SpittleController {
    private SpittleRepository spittleRepository;
    private static final String MAX_LONG_AS_STRING = "9223372036854775807";
    @Autowired
    public SpittleController(
            SpittleRepository spittleRepository
    ){
        this.spittleRepository = spittleRepository;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Map model){
//
//        // Model的本质其实是一个Map
////        model.addAllAttributes(
////                spittleRepository.findSpittles(
////                        Long.MAX_VALUE, 20
////                )
////
////        );
//        model.put("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//
//
//        return "spittles";
//    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(
            @RequestParam(value = "max",
            defaultValue = MAX_LONG_AS_STRING) long max,
            @RequestParam(value = "count",
            defaultValue = "20") int count){
        return spittleRepository.findSpittles(max, count);
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showSpittle(
            @RequestParam("spittle_id") long spittleId,
            Model model) {

        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittles";
    }


    // 使用占位符
    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(
            @PathVariable("spittleId") long spittleId,
            Model model
    ) {
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittles";
    }

}
