package com.cesde.Proyecto.Integrador.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesde.Proyecto.Integrador.entity.Servicios;
import com.cesde.Proyecto.Integrador.repository.ServiciosRepository;

@Service
public class ServiciosService {
    
    @Autowired
    private ServiciosRepository serviciosRepository;

    public Servicios createServicios(Servicios servicios) {
        return serviciosRepository.save(servicios);
    }

    public List<Servicios> getAllServicios() {
        return serviciosRepository.findAll();
    }

    public Servicios getServiciosById(Long id) {
        return serviciosRepository.findById(id).orElse(null);
    }

    public Servicios updateServicios(Long id, Servicios servicios) {
        servicios.setServicioId(id);
        return serviciosRepository.save(servicios);
    }

    public void deleteServicios(Long id) {
        serviciosRepository.deleteById(id);
    }
}
