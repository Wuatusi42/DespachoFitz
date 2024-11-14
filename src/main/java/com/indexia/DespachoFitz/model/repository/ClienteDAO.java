package com.indexia.DespachoFitz.model.repository;

import com.indexia.DespachoFitz.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente,Integer> {
    List<Cliente> findByNombreComercialAndEstatusaVigenciaAndRegimen(String nombreComercial, String estatusaVigencia, String regimen);
    List<Cliente> findByPrimerNombreAndEstatusaVigenciaAndRegimen(String primerNombre, String estatusaVigencia, String regimen);
}
