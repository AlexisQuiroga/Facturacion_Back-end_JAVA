package com.facturacion.proyectofacturacion.controller;

import com.facturacion.proyectofacturacion.entity.Cliente;
import com.facturacion.proyectofacturacion.repository.ClienteRepository;
import com.facturacion.proyectofacturacion.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/getCliente/{id}")
    public Cliente getCliente(@PathVariable(value = "id") Long id) {
        return clienteService.getCliente(id);
    }

    @GetMapping("/traerClientes")
    public List<Cliente> getClientes() {
        return clienteService.traerClientes();
    }


    @PostMapping("/postCliente")
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }

    @PutMapping("/editarCliente")
    public Cliente modificarCliente(@RequestBody Cliente cliente){
        return clienteService.modificarCliente(cliente);
    }

    @DeleteMapping("/borrarCliente/{id}")
    public String borrarCliente(@PathVariable("id") Long id){
        return clienteService.borrarCliente(id);
    }

}


