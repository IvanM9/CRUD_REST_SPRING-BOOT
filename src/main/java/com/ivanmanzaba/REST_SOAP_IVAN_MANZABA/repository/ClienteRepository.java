package com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.repository;

import com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.model.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity, Integer> {
}
