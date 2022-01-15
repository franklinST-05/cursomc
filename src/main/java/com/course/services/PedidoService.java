package com.course.services;

import java.util.Optional;

import com.course.domain.Pedido;
import com.course.repositories.PedidoRepository;
import com.course.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private  PedidoRepository pedidoRepository;

    public Pedido findById(Integer id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto nao encontrado ID: " + id + ", Tipo: " + Pedido.class.getName()
        ));
    }
}
