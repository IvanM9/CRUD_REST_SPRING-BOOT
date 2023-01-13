package com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.service;

import com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.model.ClienteEntity;
import com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteServiceImplement implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ArrayList<ClienteEntity> getAllClients() {

        return (ArrayList<ClienteEntity>) clienteRepository.findAll();
    }

    @Override
    public Optional<ClienteEntity> getClientById(int codcliente) {

        return clienteRepository.findById(codcliente);
    }

    @Override
    public ClienteEntity saveClient(ClienteEntity cliente) {

        return clienteRepository.save(cliente);
    }

    @Override
    public boolean deleteClienteById(int codcliente) {
        try {
            Optional<ClienteEntity> u = getClientById(codcliente);
            clienteRepository.delete(u.get());
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
