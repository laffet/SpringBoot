package com.workshop.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.demo.entities.Compte;
import com.workshop.demo.repositories.CompteCCRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/compte")
public class CompteController {

	@Autowired
	private CompteCCRepository compteCCRepository;

	@GetMapping("")
	public ResponseEntity<List<Compte>> getAllcomptes() {
		try {
			List<Compte> comptes = new ArrayList<Compte>();
			compteCCRepository.findAll().forEach(comptes::add);

			if (comptes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(comptes, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
