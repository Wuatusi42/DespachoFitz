package com.indexia.DespachoFitz.service;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.utils.ClienteRequest;

import java.util.List;

public interface ClienteService {
    public Cliente save(Cliente cliente);
    List<Cliente> findByNombreComercialAndEstatusaVigenciaAndRegimen(String nombreComercial, String estatusaVigencia, String regimen);
    public List<Cliente> findByPrimerNombreAndEstatusaVigenciaAndRegimen(String primerNombre,String estatusaVigencia,String regimen);
    public Cliente findById(Integer idCliente);
    public boolean eliminarCliente(Integer idCliente);
}
