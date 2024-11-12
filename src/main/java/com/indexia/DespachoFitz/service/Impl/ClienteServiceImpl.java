package com.indexia.DespachoFitz.service.Impl;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.model.repository.ClienteDAO;
import com.indexia.DespachoFitz.service.ClienteService;
import com.indexia.DespachoFitz.utils.ClienteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public Cliente save(Cliente cliente) {
       return clienteDAO.save(cliente);
    }

    @Override
    public List<Cliente> findByPrimerNombreAndEstatusaVigenciaAndRegimen(String primerNombre, String estatusaVigencia, String regimen) {
        return clienteDAO.findByPrimerNombreAndEstatusaVigenciaAndRegimen(primerNombre,estatusaVigencia,"Fisica");
    }

    @Override
    public Cliente findById(Integer idCliente) {
        return clienteDAO.findById(idCliente).orElse(null);
    }

    @Override
    public boolean eliminarCliente(Integer idCliente) {
        if (clienteDAO.existsById(idCliente)){
            clienteDAO.deleteById(idCliente);
            return true;
        }
        return false;
    }

}
