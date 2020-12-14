package com.regismaximo.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regismaximo.personapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
