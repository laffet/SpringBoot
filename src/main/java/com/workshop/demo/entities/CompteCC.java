package com.workshop.demo.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@DiscriminatorValue("CC")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CompteCC extends Compte {
	private double decouvert;
}
