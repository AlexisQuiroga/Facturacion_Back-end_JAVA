package com.facturacion.proyectofacturacion.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Producto")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Producto {
   @Column(name = "Id")
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column (name = "Nombre")
   private String nombre;

   @Column (name = "Cantidad")
   private Long cantidad;

   @Column(name = "Detalle")
   private String detalle;

   @Column(name = "Precio_Unitario")
   private int precioUnidatario;


}
