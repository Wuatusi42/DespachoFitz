package com.indexia.DespachoFitz.service;

import com.indexia.DespachoFitz.model.entity.Cliente;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MoralService {
    public List<Cliente> buscarClienteM(@Param("nombre_comercial") String nombreComercial, @Param("rfc") String rfc);
}
