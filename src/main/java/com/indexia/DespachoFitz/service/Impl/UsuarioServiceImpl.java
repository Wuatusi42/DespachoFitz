package com.indexia.DespachoFitz.service.Impl;

import com.indexia.DespachoFitz.model.entity.Usuario;
import com.indexia.DespachoFitz.model.repository.UsuarioDAO;
import com.indexia.DespachoFitz.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public Optional<Usuario> findByNombreUsuario(String nombreUsuario) {
        return usuarioDAO.findByNombreUsuario(nombreUsuario);
    }

    @Override
    public boolean login(String username, String password) {
        Optional<Usuario> usuarioOptional = findByNombreUsuario(username);
        return usuarioOptional.isPresent() && usuarioOptional.get().getPasswordUsuario().equals(password);
    }
}
