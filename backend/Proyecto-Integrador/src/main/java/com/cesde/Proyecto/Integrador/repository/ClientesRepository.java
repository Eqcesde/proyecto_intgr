package com.cesde.Proyecto.Integrador.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.Proyecto.Integrador.entity.Clientes;


public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}