package com.indexia.DespachoFitz.service;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.utils.ClienteRequest;

import java.util.List;

public interface ClienteService {
    public Cliente save(ClienteRequest clienteRequest);
    public List<Cliente> findAll();
    public Cliente update(Integer idCliente,ClienteRequest clienteRequest);
    public void delate(Integer idCliente);
}
