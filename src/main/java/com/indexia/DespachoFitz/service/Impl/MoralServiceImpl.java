package com.indexia.DespachoFitz.service.Impl;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.model.repository.MoralDAO;
import com.indexia.DespachoFitz.service.MoralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoralServiceImpl implements MoralService {
    @Autowired
    private MoralDAO moralDAO;
    @Override
    public List<Cliente> buscarClienteM(String nombreComercial, String rfc) {
        if (nombreComercial != null && rfc != null){
            return moralDAO.consultaMNombreRfc(nombreComercial, rfc);
        }
        if (nombreComercial != null ) {
            return moralDAO.consultaMNombre(nombreComercial);
        }
        if (rfc != null){
            return moralDAO.consultaMRfc(rfc);
        }
        return moralDAO.findAll();
    }
}
