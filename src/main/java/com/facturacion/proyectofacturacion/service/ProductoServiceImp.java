package com.facturacion.proyectofacturacion.service;

import com.facturacion.proyectofacturacion.entity.Producto;
import com.facturacion.proyectofacturacion.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;

    public Producto getProducto(Long id) {

        return productoRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Producto> traerProductos() {
        return productoRepository.findAll();
    }


    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto modificarProducto(Producto producto) {
        Producto productoModificado = productoRepository.findById(producto.getId()).get();
        productoModificado.setNombre(producto.getNombre());
        return productoRepository.save(producto);
    }

    public String borrarProducto(Long id) {
        Producto producto = productoRepository.findById(id).get();
        productoRepository.deleteById(id);
        return "Acabas de borrar a " + producto.getNombre();

    }
}
