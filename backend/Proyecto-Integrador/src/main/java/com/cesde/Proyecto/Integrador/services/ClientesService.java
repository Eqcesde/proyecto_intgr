package com.cesde.Proyecto.Integrador.services;

// Clienteservice.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesde.Proyecto.Integrador.entity.Clientes;
import com.cesde.Proyecto.Integrador.repository.ClientesRepository;

import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public Clientes createClientes(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll();
    }

    public Clientes getClientesById(Long id) {
        return clientesRepository.findById(id).orElse(null);
    }

    public Clientes updateClientes(Long id, Clientes clientes) {
        clientes.setClienteId(id);
        return clientesRepository.save(clientes);
    }

    public void deleteClientes(Long id) {
        clientesRepository.deleteById(id);
    }
}
