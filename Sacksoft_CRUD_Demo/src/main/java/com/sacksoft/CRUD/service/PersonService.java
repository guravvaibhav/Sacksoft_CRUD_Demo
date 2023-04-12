package com.sacksoft.CRUD.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sacksoft.CRUD.model.Person;

@Service
public interface PersonService {
	
	public Person savePerson(Person p);
	public List<Person> getAllPersons();
	public Person getPerson(int id);
	public Person updatePerson(int id,Person p);
	public void deleteerson(int id);
	

}
