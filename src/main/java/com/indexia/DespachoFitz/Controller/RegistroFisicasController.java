package com.indexia.DespachoFitz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroFisicasController {
    @GetMapping("/RegistroFisicas")
    public String RegistroFisicasPage(Model model) {
        return "RegristroFisicas";  // Sin .html
    }
}
