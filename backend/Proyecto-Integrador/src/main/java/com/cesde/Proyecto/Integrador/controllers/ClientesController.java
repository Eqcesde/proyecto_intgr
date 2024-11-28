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

import com.cesde.Proyecto.Integrador.entity.Clientes;
import com.cesde.Proyecto.Integrador.services.ClientesService;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping
    public Clientes createUser(@RequestBody Clientes clientes) {
        return clientesService.createClientes(clientes);
    }

    @GetMapping
    public List<Clientes> getAllClientess() {
        return clientesService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Clientes getClientesById(@PathVariable Long id) {
        return clientesService.getClientesById(id);
    }

    @PutMapping("/{id}")
    public Clientes updateClientes(@PathVariable Long id, @RequestBody Clientes Clientes) {
        return clientesService.updateClientes(id, Clientes);
    }

    @DeleteMapping("/{id}")
    public void deleteClientes(@PathVariable Long id) {
        clientesService.deleteClientes(id);
    }
}


