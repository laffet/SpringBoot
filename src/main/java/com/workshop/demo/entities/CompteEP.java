package com.workshop.demo.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@DiscriminatorValue("CE")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CompteEP extends Compte {
	private double taux;
}
