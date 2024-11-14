package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Usuario;
import com.indexia.DespachoFitz.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class PopperController {
    @Autowired
    private UsuarioService usuarioService;
   /* @GetMapping("/poperInfo")
    public String UsuarioActual(@RequestParam(idUsuario) Integer idUsuario,Model model){
        model.addAttribute("Usuario",usuario);
        return "navbarFisicos";
    }*/
}
