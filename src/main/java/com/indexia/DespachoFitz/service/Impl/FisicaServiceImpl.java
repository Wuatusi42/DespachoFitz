package com.indexia.DespachoFitz.service.Impl;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.model.repository.FisicasDAO;
import com.indexia.DespachoFitz.service.FisicasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FisicaServiceImpl implements FisicasService {
    @Autowired
    private FisicasDAO fisicasDAO;

    @Override
    public List<Cliente> buscarCliente(String primerNombre, String rfc) {
        if (primerNombre != null && rfc != null) {
            return fisicasDAO.consultaFNombreRfc(primerNombre, rfc);
        }
        if (primerNombre != null) {
            return fisicasDAO.consultaFNombre(primerNombre);
        }
        if (rfc != null) {
            return fisicasDAO.consultaFRfc(rfc);
        }
        return fisicasDAO.findAll();
    }
}