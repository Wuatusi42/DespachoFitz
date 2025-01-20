package com.indexia.DespachoFitz.model.repository;

import com.indexia.DespachoFitz.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoralDAO extends JpaRepository<Cliente,Integer> {
    @Query(value = "SELECT * FROM cliente where nombre_comercial like %?%",nativeQuery = true)
    public List<Cliente> consultaMNombre(@Param("nombre_comercial")String nombreComercial);
    @Query(value = "SELECT * FROM cliente where rfc like %?%",nativeQuery = true)
    public List<Cliente> consultaMRfc(@Param("rfc")String rfc);
    @Query(value = "SELECT * FROM cliente where nombre_comercial like %?% and rfc like %?%",nativeQuery = true)
    public List<Cliente> consultaMNombreRfc(@Param("nombre_comercial")String nombreComercial,@Param("rfc")String rfc);
}
