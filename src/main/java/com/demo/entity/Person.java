package com.demo.entity;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="personid")
	private int personid;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;

	@Column(name="birthdate")
	private String birthdate;
	
	@Column(name="salary")
	private String salary;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
	@JoinColumn(name="cityid")
	private City citylist;
	
	
	public Person()
	{
		
	}

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public City getCitylist() {
		return citylist;
	}

	public void setCitylist(City citylist) {
		this.citylist = citylist;
	}

	@Override
	public String toString() {
		return "Person [personid=" + personid + ", firstName=" + firstName + ", lastName=" + lastName + ", birthdate="
				+ birthdate + ", salary=" + salary + ", citylist=" + citylist + "]";
	}


}
