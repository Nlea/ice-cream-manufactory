package com.nlea.observability.demo.controller;

import com.nlea.observability.demo.icecreation.IceCreationService;
import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Observed (name = "Controller")
public class RestController {

    private final IceCreationService service;


    public RestController(IceCreationService service) {
        this.service = service;

    }


    @GetMapping("/freeze")
    @ResponseBody
    public String freezeIceCream() {
        return service.freeze();
    }

    @GetMapping("/mix")
    @ResponseBody
    public Boolean heatMixture()  {return service.createMixture();}

}
