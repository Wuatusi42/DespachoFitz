package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.service.ClienteService;
import com.indexia.DespachoFitz.utils.ClienteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegistroFisicasController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/RegistroFisicas")
    public String RegistroFisicasPage(Model model) {
        model.addAttribute("cliente",new Cliente());
        return "RegristroFisicas";
    }

    @PostMapping("/RegistroFisicas")
    public String save(@ModelAttribute Cliente cliente, BindingResult result,Model model) {
        if (result.hasErrors()) { // Verifica si hay errores
            model.addAttribute("errorMessage", "No se pudo registrar el cliente. Por favor, verifica los datos."); // Mensaje de error
            return "RegristroFisicas"; // Regresa al formulario en caso de error
        }
        clienteService.save(cliente);
        model.addAttribute("successMessage","Cliente Fisico Registrado con exito");
        return "RegristroFisicas";
    }
}