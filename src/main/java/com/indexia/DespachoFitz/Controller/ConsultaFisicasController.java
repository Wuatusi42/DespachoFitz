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

    @GetMapping("/buscarCliente")
    public String buscarCliente(
            @RequestParam(value = "primerNombre") String primerNombre,
            @RequestParam(value = "RFC") String RFC,
            Model model) {
        try {
           Cliente cliente = clienteService.findByPrimerNombreAndRFCAndRegimen(primerNombre,RFC,"Fisica");
            if (cliente == null) {
                model.addAttribute("mensaje", "No se encontraron resultados para los parámetros proporcionados.");
            }
            model.addAttribute("cliente", cliente);
            model.addAttribute("primerNombre", primerNombre);
            model.addAttribute("RFC", RFC);
            return "ConsultaFisicos";
        } catch (Exception e) {
            model.addAttribute("mensaje", "Ocurrió un error inesperado: " + e.getMessage());
            return "ConsultaFisicos";
        }
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
