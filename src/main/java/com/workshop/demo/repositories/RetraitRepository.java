package com.workshop.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.workshop.demo.entities.CompteCC;
import com.workshop.demo.entities.CompteEP;
import com.workshop.demo.entities.Employe;
import com.workshop.demo.entities.Groupe;
import com.workshop.demo.entities.Operation;
import com.workshop.demo.entities.Retrait;

@RepositoryRestResource
public interface RetraitRepository extends JpaRepository<Retrait, Long> {

}
