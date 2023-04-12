package com.sacksoft.CRUD.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	@Column(name = "First Name ")
	private String firstNm;
	@Column(name = "Last Name ")
	private String lastNm;
	@Column(name = "Email")
	private String email;
	@Column(name = "Age")
	private int age;

	public Person(String firstNm, String lastNm, String email, int age) {
		super();
		this.firstNm = firstNm;
		this.lastNm = lastNm;
		this.email = email;
		this.age = age;
	}

}
