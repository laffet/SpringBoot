package com.workshop.demo.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "Groupes")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Groupe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeGroupe;

	private String nomGroupe;
}