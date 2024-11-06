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
            @RequestParam(value = "sexo") String sexo,
            Model model) {
        try {
           Cliente cliente = clienteService.findByPrimerNombreAndRFCAndSexoAndRegimen(primerNombre,RFC,sexo,"Fisica");
            if (cliente == null) {
                model.addAttribute("mensaje", "No se encontraron resultados para los parámetros proporcionados.");
            }
            model.addAttribute("cliente", cliente);
            model.addAttribute("primerNombre", primerNombre);
            model.addAttribute("RFC", RFC);
            model.addAttribute("sexo", sexo);
            return "ConsultaFisicos";
        } catch (Exception e) {
            model.addAttribute("mensaje", "Ocurrió un error inesperado: " + e.getMessage());
            return "ConsultaFisicos";
        }
    }
    /*
    @GetMapping("/verDetalles")
    public String verDetalles(@RequestParam("idCliente") Integer idCliente, Model model) {
        try {
            Cliente cliente = clienteService.findById(idCliente); // Este método debe ser implementado en tu servicio
            model.addAttribute("cliente", cliente);
            return "DetallesF";
        } catch (Exception e) {
            model.addAttribute("mensaje", "Ocurrió un error inesperado al cargar los detalles: " + e.getMessage());
            return "ConsultaFisicos";
        }
    }*/
}
