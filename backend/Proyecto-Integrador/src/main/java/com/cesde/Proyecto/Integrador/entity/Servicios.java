package com.cesde.Proyecto.Integrador.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicio_Id")
    private Long servicioId;

    @Column(name = "nombre_Servicio")
    private String nombreServicio;

    @Column(name = "descripcion")
    private String descripcion;

    // Constructor vacío
    public Servicios() {
    }

    public Servicios(Long servicioId, String nombreServicio, String descripcion) {
        this.servicioId = servicioId;
        this.nombreServicio = nombreServicio;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public Long getServicioId() {
        return servicioId;
    }

    public void setServicioId(Long servicioId) {
        this.servicioId = servicioId;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
