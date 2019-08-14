package com.demo.service;

import java.util.List;

import com.demo.entity.Person;

public interface PersonService {
	
	public List<Person> getPersonsData();

	public void savePerson(Person thePerson);

	public Person getPerson(int theId);

	public void deletePerson(int theId);
}
