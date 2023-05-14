package com.facturacion.proyectofacturacion;

import com.facturacion.proyectofacturacion.entity.Cliente;
import com.facturacion.proyectofacturacion.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ProyectofacturacionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProyectofacturacionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola");
        log.info("Hola");


    }

}

