package com.indexia.DespachoFitz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetallesMoralController {
    @GetMapping("/DetallesMoral")
    public String detallesMoral(Model model){
        return "DetallesMoral";
    }
}
