package com.facturacion.proyectofacturacion.repository;

import com.facturacion.proyectofacturacion.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {



}
