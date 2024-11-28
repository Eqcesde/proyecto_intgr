package com.cesde.Proyecto.Integrador.entity;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedido_id") 
    private Long pedidoId;

    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido; 

    @Column(name = "fecha_entrega")
    private LocalDate fechaEntrega; 


    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Clientes cliente; // Relación bidireccional



    public Pedidos() {
    }


    public Pedidos(Long pedidoId, LocalDate fechaPedido, LocalDate fechaEntrega, String estado, String telefono) {
        this.pedidoId = pedidoId;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

 
    public Long getPedidoId() {
        return pedidoId;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }


    // Setters
    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
