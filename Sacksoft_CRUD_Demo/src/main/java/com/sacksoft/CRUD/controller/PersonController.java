package com.sacksoft.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacksoft.CRUD.exceptionHandler.InsufficientDataException;
import com.sacksoft.CRUD.model.Person;
import com.sacksoft.CRUD.service.PersonServiceIMPL;
@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonServiceIMPL service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Person> getPersonById(@PathVariable int id) {
		
		Person person = service.getPerson(id);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Person>> getAllPerson() {
		List<Person> person =  service.getAllPersons();
		return new ResponseEntity<>(person,  HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Person> savePerson(@RequestBody Person person) {
		if(person == null) {
			throw new InsufficientDataException();
		}
		Person opPerson = service.savePerson(person);
		return new ResponseEntity<Person>(opPerson, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Person> getPersonById(@RequestBody Person person,@PathVariable int id) {
		
		if(person == null) {
			throw new InsufficientDataException();
		}
		Person opPerson = service.updatePerson(id,person);
		return new ResponseEntity<Person>(opPerson, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public String deletePerson(@PathVariable int id) {
		service.deleteerson(id);
		return "person deleted with id "+id;
	}
	
}
