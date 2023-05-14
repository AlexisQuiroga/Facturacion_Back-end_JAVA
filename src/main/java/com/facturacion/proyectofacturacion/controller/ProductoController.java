package com.facturacion.proyectofacturacion.controller;

import com.facturacion.proyectofacturacion.entity.Producto;
import com.facturacion.proyectofacturacion.repository.ProductoRepository;
import com.facturacion.proyectofacturacion.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductoController{

    @Autowired
    ProductoService productoService;

    @Autowired
    ProductoRepository productoRepository;

    @GetMapping("/getProducto/{id}")
    public Producto getProducto(@PathVariable(value = "id") Long id) {

        return productoService.getProducto(id);
    }

    @GetMapping("/traerProducto")
    public List<Producto> getProducto() {
        return productoService.traerProductos();
    }

    @PostMapping("/postProducto")
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @PutMapping("/editarProducto")
    public Producto modificarProducto(@RequestBody Producto producto) {
        return productoService.modificarProducto(producto);
    }

    @DeleteMapping("/borrarProducto/{id}")
    public String borrarProducto(@PathVariable("id") Long id) {
        return productoService.borrarProducto(id);
    }

}


