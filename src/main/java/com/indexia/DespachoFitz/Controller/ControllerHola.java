package com.indexia.DespachoFitz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerHola {
    @GetMapping("/hola")
    public String hola(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo")String nombre, Model model){
        model.addAttribute("nombre",nombre);
        return "hola";
    }
}
