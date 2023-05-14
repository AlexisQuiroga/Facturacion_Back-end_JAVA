package com.facturacion.proyectofacturacion.service;



import com.facturacion.proyectofacturacion.entity.FacturaDetallada;
import com.facturacion.proyectofacturacion.repository.FacturaDetalladaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaDetalladaServiceImp {

    @Autowired
    FacturaDetalladaRepository facturaDetalladaRepository;

    public FacturaDetallada getFacturaDetallada(Long id) {

        FacturaDetallada facturaDetalladaAObtener = facturaDetalladaRepository.findById(id).orElseThrow(RuntimeException::new);
        return facturaDetalladaAObtener;
    }

    public FacturaDetallada guardarFacturaDetallada(FacturaDetallada facturaDetallada) {
        return facturaDetalladaRepository.save(facturaDetallada);
    }


    public String borrarDetalleFactura(Long id) {
        FacturaDetallada facturaDetallada = facturaDetalladaRepository.findById(id).get();
        facturaDetalladaRepository.deleteById(id);
        return "Borraste la factura " + facturaDetallada.getId();
    }


}

