package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demo.entity.Person;
@Controller
public class PersonDAOImpl implements PersonDAO{
	
	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Person> getPersonsData() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Person> theQuery = 
				currentSession.createQuery("from Person rder by firstName",
											Person.class);
		
		// execute query and get result list
		List<Person> persons = theQuery.getResultList();
				
		// return the results		
		return persons;
	}

	@Override
	public void savePerson(Person thePerson) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(thePerson);
		
	}
	@Override
	public Person getPerson(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Person thePerson = currentSession.get(Person.class, theId);
		
		return thePerson;
	}
	@Override
	public void deletePerson(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Person where id=:personId");
		theQuery.setParameter("personId", theId);
		
		theQuery.executeUpdate();		
	}

}

