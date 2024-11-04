package com.indexia.DespachoFitz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test")
    public String test(Model model) {
        // Si estás usando un modelo, puedes agregar atributos si es necesario
        return "index";  // Asegúrate de que este archivo exista en templates
    }
}
