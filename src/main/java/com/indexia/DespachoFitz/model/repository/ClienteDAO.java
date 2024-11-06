package com.indexia.DespachoFitz.model.repository;

import com.indexia.DespachoFitz.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente,Integer> {
    Cliente findByPrimerNombreAndRFCAndSexoAndRegimen(String primerNombre, String RFC, String sexo, String regimen);
}
