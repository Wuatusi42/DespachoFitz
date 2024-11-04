package com.indexia.DespachoFitz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetallesController {
    @GetMapping("/Detalles")
    public String detalles(Model model) {
        return "DetallesF";
    }
}
