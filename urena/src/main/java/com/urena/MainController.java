package com.urena;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/portfolio")
    public String showPortfolio(){
        return "portfolio";
    }
}
