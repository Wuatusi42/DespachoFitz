package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.service.ClienteService;
import com.indexia.DespachoFitz.utils.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistroFisicasController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/RegistroFisicas")
    public String RegistroFisicasPage(Model model) {
        model.addAttribute("cliente",new ClienteResponse());
        return "RegristroFisicas";
    }
    @PostMapping("/RegistroFisicas")
    public String registrarCliente(@ModelAttribute ClienteResponse clienteResponse, Model model) {
        try {
            clienteService.save(clienteResponse);
            model.addAttribute("successMessage", "Cliente registrado exitosamente");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Hubo un error al registrar al cliente");
        }
        return "RegristroFisicas"; // Regresar a la vista de registro
    }
}