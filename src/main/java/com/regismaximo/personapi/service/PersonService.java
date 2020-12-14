package com.regismaximo.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regismaximo.personapi.dto.response.MessageResponseDTO;
import com.regismaximo.personapi.model.Person;
import com.regismaximo.personapi.repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public MessageResponseDTO createPerson(Person person) {
		Person savedPerson = this.personRepository.save(person);
		
		return MessageResponseDTO
				.builder()
				.message("Created Person Success with id: " + savedPerson.getId())
				.build();
	}
	
}
