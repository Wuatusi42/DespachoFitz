package com.indexia.DespachoFitz.Controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroMoralController {
    @GetMapping("/RegistrarMoral")
    public String moralRegistovista(Model model){
        return "RegistroMoral";
    }

}
