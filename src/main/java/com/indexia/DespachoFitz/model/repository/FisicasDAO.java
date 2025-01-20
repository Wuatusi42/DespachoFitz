package com.indexia.DespachoFitz.model.repository;

import com.indexia.DespachoFitz.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface FisicasDAO extends JpaRepository<Cliente,Integer> {
    @Query(value = "SELECT * FROM cliente where primer_nombre like %?%",nativeQuery = true)
    public List<Cliente> consultaFNombre(@Param("primer_nombre")String primerNombre);
    @Query(value = "SELECT * FROM cliente where rfc like %?%",nativeQuery = true)
    public List<Cliente> consultaFRfc(@Param("rfc")String rfc);
    @Query(value = "SELECT * FROM cliente where primer_nombre like %?% and rfc like %?%",nativeQuery = true)
    public List<Cliente> consultaFNombreRfc(@Param("primer_nombre")String primerNombre,@Param("rfc")String rfc);
}
