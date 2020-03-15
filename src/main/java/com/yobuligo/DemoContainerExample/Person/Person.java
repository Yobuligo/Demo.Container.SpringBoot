package com.yobuligo.DemoContainerExample.Person;

import org.springframework.stereotype.Component;

@Component
public class Person implements IPerson {

	private String firstname;
	private String lastname;

	@Override
	public String getFirstname() {
		return firstname;
	}

	@Override
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String getLastname() {
		return lastname;
	}

	@Override
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
