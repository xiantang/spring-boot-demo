package spittr.config.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.config.data.Spittle;
import spittr.config.data.SpittleRepository;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/spittles")

public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(
            SpittleRepository spittleRepository
    ){
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Map model){

        // Model的本质其实是一个Map
//        model.addAllAttributes(
//                spittleRepository.findSpittles(
//                        Long.MAX_VALUE, 20
//                )
//
//        );
        model.put("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));


        return "spittles";
    }


//    @RequestMapping(method = RequestMethod.GET)
//    public List<Spittle> spittles(){
//        return spittleRepository.findSpittles(Long.MAX_VALUE
//                , 20);
//    }
}
