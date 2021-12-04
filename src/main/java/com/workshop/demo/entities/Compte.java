package com.workshop.demo.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_CPT", discriminatorType = DiscriminatorType.STRING, length = 2)
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class Compte {
	@Id
	private String codeCompte;
	private Date dateCreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name = "Code_Cli")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "Code_Emp")
	private Employe employe;
	@OneToMany(mappedBy = "compte")
	private Collection<Operation> operations;
}