package com.yobuligo.DemoContainerExample.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	IPerson person;

	@GetMapping("/person")
	public IPerson getPerson() {
		person.setFirstname("Peter");
		person.setLastname("Hoffmann");
		return person;
	}

}
