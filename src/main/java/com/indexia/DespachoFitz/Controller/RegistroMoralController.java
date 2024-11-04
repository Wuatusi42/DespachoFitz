package com.indexia.DespachoFitz.Controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroMoralController {
    @GetMapping("/RegistrarMoral")
    public String moralRegistovista(Model model){
        return "RegistroMoral";
    }
}
