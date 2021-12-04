package com.workshop.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.workshop.demo.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
