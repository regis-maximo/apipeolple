package com.regismaximo.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regismaximo.personapi.dto.response.MessageResponseDTO;
import com.regismaximo.personapi.model.Person;
import com.regismaximo.personapi.service.PersonService;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

	private PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@PostMapping
	public ResponseEntity<MessageResponseDTO> createPerson(@RequestBody Person person) {
		return new ResponseEntity<MessageResponseDTO>
			(this.personService.createPerson(person), HttpStatus.CREATED);
	}
	
	
}
