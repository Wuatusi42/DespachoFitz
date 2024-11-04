package com.indexia.DespachoFitz.model.repository;

import com.indexia.DespachoFitz.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioDAO extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
}
