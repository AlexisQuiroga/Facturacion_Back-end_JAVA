package com.facturacion.proyectofacturacion.service;

import com.facturacion.proyectofacturacion.entity.Cliente;
import com.facturacion.proyectofacturacion.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImp implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente getCliente(Long id) {

        Cliente clienteAObtener = clienteRepository.findById(id).orElseThrow(RuntimeException::new);
        return clienteAObtener;
    }

    public List<Cliente> traerClientes() {
        return clienteRepository.findAll();
    }

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente modificarCliente(Cliente cliente) {
        Cliente clienteModificado = clienteRepository.findById(cliente.getId()).get();
        clienteModificado.setNombre(cliente.getNombre());
        return clienteRepository.save(cliente);
    }

    public String borrarCliente(Long id) {
        Cliente cliente = clienteRepository.findById(id).get();
        clienteRepository.deleteById(id);
        return "Borraste a " + cliente.getNombre();
    }


}
