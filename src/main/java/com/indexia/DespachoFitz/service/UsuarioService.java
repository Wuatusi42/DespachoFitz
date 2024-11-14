package com.indexia.DespachoFitz.service;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.model.entity.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    boolean login(String username, String password);
    public Usuario findById(Integer idCliente);
}
