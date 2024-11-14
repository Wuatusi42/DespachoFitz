package com.indexia.DespachoFitz.Controller;

import com.indexia.DespachoFitz.model.entity.Usuario;
import com.indexia.DespachoFitz.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/")
    public String showLoginPage(Model model) {
        return "index";
    }

    @PostMapping("/login")
    public String validateLogin(@RequestParam String nombre, @RequestParam String password, Model model, HttpSession session) {
        boolean valid = usuarioService.login(nombre, password);
        if (valid) {
            model.addAttribute("showModal", true); //validar mosal
            session.setAttribute("nombreUsuario",nombre);
            return "index"; // Regresa a la página de login
        } else {
            model.addAttribute("error", "Credenciales inválidas.");//eeror credenciales
            return "index"; // Regresa a la página de login con el mensaje de error
        }
    }

}
