package com.facturacion.proyectofacturacion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Detalle Factura")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FacturaDetallada {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "id_Producto")
    int idProducto;
    @Column(name = "Precio_por_unidad")
    int precioUnitario;
    @Column(name = "Cantidad_productos")
    int cantidad;
    @Column(name = "Subtotal")
    double subtotal;
    @Column(name = "Nombre_del_producto")
    String nombreDelProducto;
    @Column(name = "Total")
    double total;


}
