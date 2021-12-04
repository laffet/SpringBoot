package com.workshop.demo.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeEmploye;
	private String nomEmploye;

	@ManyToOne
	@JoinColumn(name = "Code_emp_sup")
	private Employe EmployesSup;
	@ManyToMany
	@JoinTable(name = "Emp_Gr", joinColumns = @JoinColumn(name = "Num_EMP"), inverseJoinColumns = @JoinColumn(name = "Num_Groupe"))
	private Collection<Groupe> groupes;
}