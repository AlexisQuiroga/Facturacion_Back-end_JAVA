package com.facturacion.proyectofacturacion.repository;

import com.facturacion.proyectofacturacion.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {


}
