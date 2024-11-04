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
    public Cliente save(ClienteRequest clienteRequest) {
        Cliente cliente = new Cliente();
        cliente.setPrimerNombre(clienteRequest.getInicialName());
        cliente.setSegundoNombre(clienteRequest.getSecondName());
        cliente.setTercerNombre(clienteRequest.getThreeName());
        cliente.setApellidoMaterno(clienteRequest.getMaternLastName());
        cliente.setApellidoPaterno(clienteRequest.getPaternLastName());
        cliente.setDireccion1(clienteRequest.getAddress1());
        cliente.setDireccion2(clienteRequest.getAddress2());
        cliente.setRFC(clienteRequest.getRFC());
        cliente.setFechaNacimiento(clienteRequest.getBirthdate());
        cliente.setCiudad(clienteRequest.getCity());
        cliente.setEstado(clienteRequest.getState());
        cliente.setPais(clienteRequest.getCountry());
        cliente.setSexo(clienteRequest.getSex());
        cliente.setEdad(clienteRequest.getAge());
        cliente.setTelefono1(clienteRequest.getPhone1());
        cliente.setTelefono2(clienteRequest.getPhone2());
        cliente.setCURP(clienteRequest.getCURP());
        cliente.setActividadEconomica(clienteRequest.getEconomyActivity());
        cliente.setIngresosMensuales(clienteRequest.getMonthIncome());
        cliente.setEstatusPadron(clienteRequest.getStatusPadron());
        cliente.setNombreComercial(clienteRequest.getComercialName());
        cliente.setFechaInicioOperaciones(clienteRequest.getDateInicialOperation());
        cliente.setHonorariosMensuales(clienteRequest.getMonthIncome());
        cliente.seteFirma(clienteRequest.geteSignature());
        cliente.setClabeCiegRps(clienteRequest.getClabCiegRps());
        cliente.setSituacionBancaria(clienteRequest.getBancarySituacion());
        cliente.setRegimen(clienteRequest.getRegimen());
        return clienteDAO.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> clienteList = clienteDAO.findAll();
        return clienteList;
    }

    @Override
    public Cliente update(Integer idCliente, ClienteRequest clienteRequest) {
        Optional<Cliente> existe = clienteDAO.findById(idCliente);
        if (existe.isPresent()) {
            Cliente clientesUp = existe.get();
            if (clienteRequest.getInicialName() != null){
                clientesUp.setPrimerNombre(clienteRequest.getInicialName());
            }
            return clienteDAO.save(clientesUp);
        }
        return null;
    }

    @Override
    public void delate(Integer idCliente) {
        clienteDAO.deleteById(idCliente);
    }
}
