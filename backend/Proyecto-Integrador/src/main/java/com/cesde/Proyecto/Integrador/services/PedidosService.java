package com.cesde.Proyecto.Integrador.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesde.Proyecto.Integrador.entity.Pedidos;
import com.cesde.Proyecto.Integrador.repository.PedidosRepository;

@Service
public class PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;

    public Pedidos createPedidos(Pedidos pedidos) {
        return pedidosRepository.save(pedidos);
    }

    public List<Pedidos> getAllPedidos() {
        return pedidosRepository.findAll();
    }

    public Pedidos getPedidosById(Long id) {
        return pedidosRepository.findById(id).orElse(null);
    }

    public Pedidos updatePedidos(Long id, Pedidos pedidos) {
        pedidos.setPedidoId(id);
        return pedidosRepository.save(pedidos);
    }

    public void deletePedidos(Long id) {
        pedidosRepository.deleteById(id);
    }
}
