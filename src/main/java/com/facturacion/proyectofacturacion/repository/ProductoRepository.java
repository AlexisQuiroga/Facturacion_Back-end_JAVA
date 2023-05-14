package com.facturacion.proyectofacturacion.repository;

import com.facturacion.proyectofacturacion.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}