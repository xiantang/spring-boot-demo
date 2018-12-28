package spittr.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spittr.data.Spitter;
import spittr.data.SpitterRepository;
import spittr.data.Spittle;
import spittr.data.SpittleRepository;

import java.util.Date;
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
//
//    @Autowired
//    public SpittleController(
//
//            SpitterRepository spitterRepository
//    ){
//
//        this.spittleRepository = spittleRepository;
//    }
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
        Spittle spittle = spittleRepository.findOne(spittleId);


        if (spittle == null){
            throw new SpittleNotFoundException();
        }
        model.addAttribute(spittle);
        return "spittles";
    }


//    @RequestMapping(method = RequestMethod.POST)
//    public String saveSpittle(SpittleForm form, Model model) {
//        spittleRepository.save(
//                new Spittle(null, form.getMessage(), new Date(),
//                        form.getLongitude(), form.getLatitude)
//        );
//        return "redirect:/spittles";
//    }
//
//    @ExceptionHandler(DuplicateKeyException.class)
//    public String handle



}
