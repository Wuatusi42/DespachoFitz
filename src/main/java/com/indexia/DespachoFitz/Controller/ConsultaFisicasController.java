package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.service.ClienteService;
import com.indexia.DespachoFitz.service.FisicasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ConsultaFisicasController {
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private FisicasService fisicasService;

    @GetMapping("/ConsultaFisicos")
    public String ConsultaFisicos(Model model) {
        return "ConsultaFisicos";
    }

    @GetMapping("/buscarCliente")
    public String buscarCliente(
            @RequestParam(value = "primerNombre") String primerNombre,
            @RequestParam(value = "rfc") String rfc,
            Model model) {
        List<Cliente> clientes = fisicasService.buscarCliente(primerNombre, rfc);
        model.addAttribute("clientes", clientes);
        model.addAttribute("primerNombre", primerNombre);
        model.addAttribute("rfc", rfc);
        return "ConsultaFisicos";
    }

    @GetMapping("/verDetalles")
    public String verDetalles(@RequestParam("idCliente") Integer idCliente, Model model) {
        Cliente cliente = clienteService.findById(idCliente);
        if (cliente == null) {
            model.addAttribute("mensaje", "Cliente no encontrado.");
            return "ConsultaFisicos";
        }

        model.addAttribute("cliente", cliente);
        return "DetallesF";
    }
}
