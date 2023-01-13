package com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.controller;

import com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.model.ClienteEntity;
import com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.service.ClienteServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    ClienteServiceImplement servicio;

    @GetMapping("/all")
    public ArrayList<ClienteEntity> getAllClients(){
        return servicio.getAllClients();
    }

    @GetMapping("/{id}")
    public Optional<ClienteEntity> getClientById(@PathVariable("id") int id){
        return servicio.getClientById(id);
    }

    @PostMapping("/save")
    public ClienteEntity saveClient(@RequestBody ClienteEntity client){
        return servicio.saveClient(client);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCliente(@PathVariable("id") int id){
        if(servicio.deleteClienteById(id)){
            return "Se ha eliminado el usuario";
        }
        else
            return "No se ha eliminado";
    }

    @GetMapping("/saludar")
    public String saludar(){
        return "hola mundo";
    }
}
