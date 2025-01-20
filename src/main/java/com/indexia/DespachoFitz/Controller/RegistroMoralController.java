package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.service.ClienteService;
import com.indexia.DespachoFitz.utils.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroMoralController {
    @Autowired
    private ClienteService clienteService;
    @GetMapping("/RegistrarMoral")
    public String moralRegistovista(Model model){
        model.addAttribute("cliente",new Cliente());
        return "RegistroMoral";
    }
    @PostMapping("/RegistroMoral")
    public String save(@ModelAttribute ClienteResponse cliente, BindingResult result, Model model) {
        if (result.hasErrors()) { // Verifica si hay errores
            model.addAttribute("errorMessage", "No se pudo registrar el cliente. Por favor, verifica los datos."); // Mensaje de error
            return "RegistroMoral"; // Regresa al formulario en caso de error
        }
        clienteService.save(cliente);
        model.addAttribute("successMessage","Cliente Fisico Registrado con exito");
        return "RegistroMoral";
    }
}
