package com.indexia.DespachoFitz.service;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.utils.ClienteResponse;

public interface ClienteService {
    public Cliente save(ClienteResponse clienteResponse);
    public Cliente findById(Integer idCliente);
    public boolean eliminarCliente(Integer idCliente);
}
