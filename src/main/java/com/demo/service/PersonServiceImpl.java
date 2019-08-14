package com.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.PersonDAO;
import com.demo.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {
	// need to inject customer dao
		@Autowired
		private PersonDAO personDAO;
		
		@Override
		@Transactional
		public List<Person> getPersonsData() {
			return personDAO.getPersonsData();
		}

		@Override
		@Transactional
		public void savePerson(Person thePerson) {

			personDAO.savePerson(thePerson);
		}

		@Override
		@Transactional
		public Person getPerson(int theId) {
			
			return personDAO.getPerson(theId);
		}

		@Override
		@Transactional
		public void deletePerson(int theId) {
			
			personDAO.deletePerson(theId);
		}
}
