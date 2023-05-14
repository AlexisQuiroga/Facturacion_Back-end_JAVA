package com.facturacion.proyectofacturacion.service;

import com.facturacion.proyectofacturacion.entity.FacturaDetallada;

import java.util.List;

public interface FacturaDetalladaService {

    FacturaDetallada getFacturaDetallada(Long id);

    List<FacturaDetallada> traerFacturasDetalladas();

    FacturaDetallada guardarFacturasDetalladas(FacturaDetallada facturaDetallada);

    FacturaDetallada modificarFacturaDetallada(FacturaDetallada facturaDetallada);

    String borrarFacturaDetallada(Long id);
}
