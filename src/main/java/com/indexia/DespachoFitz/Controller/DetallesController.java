package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.service.ClienteService;
import jakarta.persistence.Access;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class DetallesController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/Detalles")
    public String detalles(@RequestParam("idCliente") Integer idCliente, Model model) {
        Cliente cliente = clienteService.findById(idCliente);
        if (cliente == null) {
            model.addAttribute("mensaje", "Cliente no encontrado.");
            return "ConsultaFisicos"; // Regresa a la vista de consulta si no encuentra el cliente
        }

        // Agrega el cliente al modelo para mostrar los detalles
        model.addAttribute("cliente", cliente);
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

    @GetMapping("/Detalles/descargarExcel")
    public ResponseEntity<byte[]> descargarExcel(@RequestParam("idCliente") Integer idCliente) throws IOException {
        // Crear un libro de trabajo vacío
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Convertir el libro de trabajo a bytes
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        workbook.write(bos);
        workbook.close();

        // Configurar las cabeceras para la descarga
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", "detalles_cliente.xlsx");
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_OCTET_STREAM);

        // Retornar el archivo para descarga
        return new ResponseEntity<>(bos.toByteArray(), headers, HttpStatus.OK);
    }
}
