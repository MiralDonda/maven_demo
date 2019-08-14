package com.demo.dao;

import java.util.List;

import com.demo.entity.Person;
public interface PersonDAO {

		public List<Person> getPersonsData();

		public void savePerson(Person thePerson);

		public Person getPerson(int theId);

		public void deletePerson(int theId);
		
	}

