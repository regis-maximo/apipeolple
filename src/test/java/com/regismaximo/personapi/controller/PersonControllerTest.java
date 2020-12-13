package com.regismaximo.personapi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonControllerTest {

	@Test
	void testGetBook() {
		
		PersonController p = new PersonController();
		assertEquals("API Test!", p.getBook());
	}

}
