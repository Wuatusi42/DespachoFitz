package com.indexia.DespachoFitz.service;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.utils.ClienteRequest;

import java.util.List;

public interface ClienteService {
    public Cliente save(Cliente cliente);
    public Cliente findByPrimerNombreAndRFCAndSexoAndRegimen(String primerNombre,String RFC,String sexo,String regimen);
    public Cliente findById(Integer idCliente);
}
