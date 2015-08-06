package nl.tricode.angular.rest.controller;

import nl.tricode.angular.rest.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mvdmark on 6-8-2015.
 */
@RestController
public class PersonController {

	@RequestMapping("/persons")
	public List<Person> getPersons() {
		return initPersonList();
	}

	private List<Person> initPersonList() {
		List<Person> persons = new ArrayList<>();

		Person person1 = new Person(1 ,"Michaël", "van der Mark");
		Person person2 = new Person(2 ,"Jan", "de Test");
		Person person3 = new Person(3 ,"Joop", "Hooi");
		Person person4 = new Person(4 ,"Piet", "Zak");
		Person person5 = new Person(5 ,"Johan", "de Behanger");
		Person person6 = new Person(6 ,"Jacco", "de Schooijer");
		Person person7 = new Person(7 ,"Julia", "Augustus");
		Person person8 = new Person(8 ,"Pieternella", "de Boerin");
		Person person9 = new Person(9 ,"Zoeff", "de Haas");

		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		persons.add(person7);
		persons.add(person8);
		persons.add(person9);

		return persons;
	}
}
