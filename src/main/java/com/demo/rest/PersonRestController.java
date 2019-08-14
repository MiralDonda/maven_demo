package com.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Person;
import com.demo.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonRestController {
	@Autowired
	private PersonService personrservice;
	
	@GetMapping("/persons")
	
	//all persons
	
	public List<Person> getPersonsData()
	{
		return personrservice.getPersonsData();
	}
	//person by ID
	@GetMapping("/persons/{personsId}")
	public Person getPerson(@PathVariable int personsId)
	{
		Person thePerson=personrservice.getPerson(personsId);
		return thePerson;
	}
	
	//Add person
	@PostMapping("/persons")
	public Person addPerson(@RequestBody Person thePerson)
	{	
		thePerson.setPersonid(0);
		personrservice.savePerson(thePerson);
		return thePerson;
		
	}
	
	//update person
	@PutMapping("/persons")
	public Person updatePerson(@RequestBody Person thePerson)
	{	
		personrservice.savePerson(thePerson);
		return thePerson;
		
	}
	
	//delete person
	@DeleteMapping("/persons/{personsId}")
	public String deletePerson(@PathVariable int personsId)
	{	
		personrservice.deletePerson(personsId);
		return "deleted persons ID :"+personsId;
		
	}
	
	
}
