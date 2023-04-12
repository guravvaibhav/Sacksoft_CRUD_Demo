package com.sacksoft.CRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sacksoft.CRUD.model.Person;

public interface PersonRepositery extends JpaRepository<Person, Integer>{

}
