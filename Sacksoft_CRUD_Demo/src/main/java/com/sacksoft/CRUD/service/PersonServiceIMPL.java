package com.sacksoft.CRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacksoft.CRUD.dao.PersonRepositery;
import com.sacksoft.CRUD.exceptionHandler.PersonNotFoundException;
import com.sacksoft.CRUD.model.Person;

@Service
public class PersonServiceIMPL implements PersonService{
	
	@Autowired
	PersonRepositery repositery;
	
	@Override
	public Person savePerson(Person p) {
		
		return repositery.save(p);
	}

	@Override
	public List<Person> getAllPersons() {
		return repositery.findAll();
	}

	@Override
	public Person getPerson(int id) {
		return repositery.findById(id).orElseThrow(()->new PersonNotFoundException("person not found with id "+id));
	}

	@Override
	public Person updatePerson(int id, Person p) {
		Person uPerson = repositery.findById(id).
				orElseThrow(()->new PersonNotFoundException("person not found with id "+id));
		
		uPerson.setId(id);
		uPerson.setAge(p.getAge());
		uPerson.setFirstNm(p.getFirstNm());
		uPerson.setLastNm(p.getLastNm());
		uPerson.setEmail(p.getEmail());
		return repositery.save(uPerson);
	}

	@Override
	public void deleteerson(int id) {
		repositery.deleteById(id);
	}

}
