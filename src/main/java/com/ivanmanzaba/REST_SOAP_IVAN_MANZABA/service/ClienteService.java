package com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.service;

import com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.model.ClienteEntity;
import com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public interface ClienteService {
    ArrayList<ClienteEntity> getAllClients();
    Optional<ClienteEntity> getClientById(int codcliente);
    ClienteEntity saveClient(ClienteEntity cliente);
    boolean deleteClienteById(int codcliente);
}

