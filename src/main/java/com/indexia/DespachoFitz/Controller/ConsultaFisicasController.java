package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConsultaFisicasController {
    @Autowired
    private ClienteService clienteService;
    @GetMapping("/ConsultaFisicos")
    public String ConsultaFisicos(Model model) {
        return "ConsultaFisicos";
    }
    @GetMapping("/ConsultaFisicos")
    public String buscarCliente(
            @RequestParam(value = "primerNombre",required = false)String primerNombre,
            @RequestParam(value = "RFC",required = false)String RFC,
            @RequestParam(value = "sexo",required = false)String sexo,
            Model model
    ){
        Cliente cliente = clienteService.findByCliente(primerNombre, RFC, sexo);
        model.addAttribute("cliente",cliente);
        model.addAttribute("primerNombre",primerNombre);
        model.addAttribute("RFC",RFC);
        model.addAttribute("sexo",sexo);
        return "ConsultaFisicos";
    }
}
