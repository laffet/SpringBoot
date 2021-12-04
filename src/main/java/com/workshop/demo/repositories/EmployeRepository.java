package com.workshop.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.workshop.demo.entities.CompteCC;
import com.workshop.demo.entities.CompteEP;
import com.workshop.demo.entities.Employe;

@RepositoryRestResource
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
