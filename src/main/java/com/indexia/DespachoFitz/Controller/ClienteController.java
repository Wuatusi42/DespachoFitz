package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    /*@PostMapping("/save")
    public ResponseEntity<?> create(@RequestBody ClienteRequest request) {
        try {
            Cliente productoRequest = clienteService.save(request);
            return ResponseEntity.status(HttpStatus.OK).body(request);
        } catch (Exception e) {
            System.out.println("error" + e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
        }
    }*/
}
