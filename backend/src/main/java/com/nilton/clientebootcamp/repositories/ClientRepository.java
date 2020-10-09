package com.nilton.clientebootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nilton.clientebootcamp.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
