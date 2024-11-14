package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ConsultaMoralController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/ConsultaMoral")
    public String vistaConsultaMoral(Model model) {
        return "ConsultaMoral";
    }

        @GetMapping("/buscarClienteMoral")
        public String buscarClienteMoral(
                @RequestParam(value = "nombreComercial") String nombreComercial,
                @RequestParam(value = "estatusaVigencia") String estatusaVigencia,
                Model model) {
            try {
               List<Cliente> clientes = clienteService.findByNombreComercialAndEstatusaVigenciaAndRegimen(nombreComercial,estatusaVigencia,"Moral");
                if (clientes == null) {
                    model.addAttribute("mensaje", "No se encontraron resultados para los parámetros proporcionados.");
                }
                model.addAttribute("clientes", clientes);
                model.addAttribute("nombreComercial", nombreComercial);
                model.addAttribute("estatusaVigencia", estatusaVigencia);
                return "ConsultaMoral";
            } catch (Exception e) {
                model.addAttribute("mensaje", "Ocurrió un error inesperado: " + e.getMessage());
                return "ConsultaMoral";
            }
        }
        @GetMapping("/verDetallesM")
        public String verDetalles(@RequestParam("idCliente") Integer idCliente, Model model) {
            Cliente cliente = clienteService.findById(idCliente);
            if (cliente == null) {
                model.addAttribute("mensaje", "Cliente no encontrado.");
                return "ConsultaMoral";
            }

            model.addAttribute("cliente", cliente);
            return "DetallesMoral";
        }
    }
