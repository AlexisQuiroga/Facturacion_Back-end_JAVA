package com.facturacion.proyectofacturacion.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Cliente")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Cliente {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "DNI")
    private String dni;
    @Column(name = "Localidad")
    private String localidad;


}


