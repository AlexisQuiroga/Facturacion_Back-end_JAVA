package com.facturacion.proyectofacturacion.repository;


import com.facturacion.proyectofacturacion.entity.Cliente;
import com.facturacion.proyectofacturacion.entity.FacturaDetallada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaDetalladaRepository extends JpaRepository<FacturaDetallada, Long> {


}
