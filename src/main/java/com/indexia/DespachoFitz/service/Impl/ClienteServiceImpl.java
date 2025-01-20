package com.indexia.DespachoFitz.service.Impl;

import com.indexia.DespachoFitz.model.entity.Cliente;
import com.indexia.DespachoFitz.model.repository.ClienteDAO;
import com.indexia.DespachoFitz.service.ClienteService;
import com.indexia.DespachoFitz.utils.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public Cliente save(ClienteResponse clienteResponse) {
        Cliente cliente = new Cliente();
        cliente.setPrimerNombre(clienteResponse.getInicialName());
        cliente.setSegundoNombre(clienteResponse.getSecondName());
        cliente.setTercerNombre(clienteResponse.getThreeName());
        cliente.setApellidoPaterno(clienteResponse.getPaternalSurname());
        cliente.setApellidoMaterno(clienteResponse.getMaternalSurname());
        cliente.setRfc(clienteResponse.getRfc());
        cliente.setFechaNacimiento(clienteResponse.getDateBirthday());
        cliente.setCiudad(clienteResponse.getCity());
        cliente.setEstado(clienteResponse.getState());
        cliente.setPais(clienteResponse.getCountry());
        cliente.setSexo(clienteResponse.getSex());
        cliente.setEdad(clienteResponse.getAges());
        cliente.setTelefono1(clienteResponse.getPhone1());
        cliente.setTelefono2(clienteResponse.getPhone2());
        cliente.setCURP(clienteResponse.getCURP());
        cliente.setActividadEconomica(clienteResponse.getActivityEconomy());
        cliente.setIngresosMensuales(clienteResponse.getMonthlyIncome());
        cliente.setEstatusPadron(clienteResponse.getPadronStatus());
        cliente.setNombreComercial(clienteResponse.getComercialName());
        cliente.setFechaInicioOperaciones(clienteResponse.getDateInicialOperations());
        cliente.setHonorariosMensuales(clienteResponse.getMonthlyFees());
        cliente.seteFirma(clienteResponse.getFirmaE());
        cliente.setClabeCiegRps(clienteResponse.getCiegRpsclave());
        cliente.setSituacionBancaria(clienteResponse.getBancarySituation());
        cliente.setRegimen(clienteResponse.getRegime());
        cliente.setColonia(clienteResponse.getCologne());
        cliente.setCalle(clienteResponse.getStreet());
        cliente.setNumeroCasa(clienteResponse.getNumberHome());
        cliente.setEstatusaVigencia(clienteResponse.getStatusValidity());
        cliente.setEmail(clienteResponse.getCorreo());
        return clienteDAO.save(cliente);
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
