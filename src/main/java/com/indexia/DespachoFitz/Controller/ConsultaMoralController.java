package com.indexia.DespachoFitz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultaMoralController {
    @GetMapping("/ConsultaMoral")
    public String vistaConsultaMoral(Model model){
        return "ConsultaMoral";
    }
}
