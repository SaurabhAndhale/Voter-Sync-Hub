package com.Eci.Controller;

import java.util.List;

import com.Eci.Entity.Person;
import com.Eci.Services.Service;

public class Controller {
	Service service = null;

	public List<Person> listOfPerson() {
		service = new Service();
		List<Person> list = service.listOfPerson();
		return list;
	}

	public Object insertPerson(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {
		service = new Service();
		Object p1 = service.insertPerson(adhar, name, vid, cons, houseNo, city, pin);
		return p1;
	}

	public Object updatePerson(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {
		service = new Service();
		Object p1 = service.updatePerson(adhar, name, vid, cons, houseNo, city, pin);
		return p1;

	}

	public void deletePerson(int adhar) {

		service = new Service();
		service.deletePerson(adhar);

	}

}
