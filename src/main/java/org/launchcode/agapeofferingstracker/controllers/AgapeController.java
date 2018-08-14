package org.launchcode.agapeofferingstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "agape")
public class AgapeController {

    @RequestMapping (value = "")
    public String index (Model model){

        model.addAttribute ("title", "Agape Offerings Tracker");
        return "agape/index";
    }


}
