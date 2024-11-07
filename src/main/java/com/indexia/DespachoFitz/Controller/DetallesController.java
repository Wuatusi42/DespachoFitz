package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.service.ClienteService;
import jakarta.persistence.Access;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DetallesController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/Detalles")
    public String detalles(Model model) {
        return "DetallesF";
    }
    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(@PathVariable("idCliente") Integer idCliente, Model model) {
        boolean clienteEliminado = clienteService.eliminarCliente(idCliente);

        if (clienteEliminado) {
            model.addAttribute("mensaje", "Cliente eliminado con éxito.");
        } else {
            model.addAttribute("mensaje", "No se pudo eliminar el cliente, ya que no existe.");
        }

        return "redirect:/ConsultaFisicos"; // Redirige a la vista correspondiente
    }
}
