package com.indexia.DespachoFitz.service;

import com.indexia.DespachoFitz.model.entity.Cliente;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FisicasService {
    public List<Cliente> buscarCliente(@Param("primer_nombre") String primerNombre, @Param("rfc") String rfc);
}
