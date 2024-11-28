package com.cesde.Proyecto.Integrador.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesde.Proyecto.Integrador.entity.Servicios;
import com.cesde.Proyecto.Integrador.services.ServiciosService;

@RestController
@RequestMapping("/api/servicios")
public class ServiciosController {

    @Autowired
    private ServiciosService serviciosService;

    @PostMapping
    public Servicios createUser(@RequestBody Servicios servicios) {
        return serviciosService.createServicios(servicios);
    }

    @GetMapping
    public List<Servicios> getAllServicios() {
        return serviciosService.getAllServicios();
    }

    @GetMapping("/{id}")
    public Servicios getServiciosById(@PathVariable Long id) {
        return serviciosService.getServiciosById(id);
    }

    @PutMapping("/{id}")
    public Servicios updateServicios(@PathVariable Long id, @RequestBody Servicios servicios) {
        return serviciosService.updateServicios(id, servicios);
    }

    @DeleteMapping("/{id}")
    public void deleteServicios(@PathVariable Long id) {
        serviciosService.deleteServicios(id);
    }
}


