package com.facturacion.proyectofacturacion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Factura")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Factura {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "Numero_de_venta")
    int codigo;
    @Column(name = "Id_Cliente")
    int idCliente;
    @Column(name = "Subtotal")
    double Subtotal;
    @Column(name = "Total_a_pagar")
    double totalAPagar;
    @Column(name = "Fecha")
    String Fecha;
}
