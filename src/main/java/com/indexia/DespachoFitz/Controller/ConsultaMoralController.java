package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.service.ClienteService;
import com.indexia.DespachoFitz.service.MoralService;
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
    @Autowired
    private MoralService moralService;

    @GetMapping("/ConsultaMoral")
    public String vistaConsultaMoral(Model model) {
        return "ConsultaMoral";
    }

    @GetMapping("/buscarClienteMoral")
    public String consultaMoral(@RequestParam("nombreComercial") String nombreComercial, @RequestParam("rfc") String rfc, Model model) {
        List<Cliente> clientes = moralService.buscarClienteM(nombreComercial, rfc);
        model.addAttribute("clientes",clientes);
        model.addAttribute("nombreComercial",nombreComercial);
        model.addAttribute("rfc",rfc);
        return "ConsultaMoral";
    }

    @GetMapping("/verDetallesM")
    public String verDetallesM(@RequestParam("idCliente") Integer idCliente, Model model) {
        Cliente cliente = clienteService.findById(idCliente);
        if (cliente == null) {
            model.addAttribute("mensaje", "Cliente no encontrado.");
            return "ConsultaMoral";
        }

        model.addAttribute("cliente", cliente);
        return "DetallesMoral";
    }
}
