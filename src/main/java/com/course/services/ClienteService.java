package com.course.services;

import java.util.Optional;

import com.course.domain.Cliente;
import com.course.repositories.ClienteRepository;
import com.course.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente findById(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto nao encontrado ID: " + id + ", Tipo: " + Cliente.class.getName()
        ));
    }
}
