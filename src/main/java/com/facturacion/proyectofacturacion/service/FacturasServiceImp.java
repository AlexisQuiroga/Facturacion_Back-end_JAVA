package com.facturacion.proyectofacturacion.service;


import com.facturacion.proyectofacturacion.entity.Cliente;
import com.facturacion.proyectofacturacion.entity.Factura;
import com.facturacion.proyectofacturacion.repository.ClienteRepository;
import com.facturacion.proyectofacturacion.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturasServiceImp {

    @Autowired
    FacturaRepository facturaRepository;

    public Factura getFactura(Long id) {

        Factura facturaAObtener = facturaRepository.findById(id).orElseThrow(RuntimeException::new);
        return facturaAObtener;
    }

    public List<Factura> traerFacturas() {
        return facturaRepository.findAll();
    }

    public Factura guardarFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public Factura modificarFactura(Factura factura) {
        Factura facturaModificada = facturaRepository.findById(factura.getId()).get();
        facturaModificada.setId((long) factura.getIdCliente());
        return facturaRepository.save(factura);
    }

    public String borrarFactura(Long id) {
        Factura factura = facturaRepository.findById(id).get();
        facturaRepository.deleteById(id);
        return "Borraste la factura " + factura.getId();


    }
}
