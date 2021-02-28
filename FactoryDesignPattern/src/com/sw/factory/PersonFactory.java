package com.sw.factory;

import com.sw.comps.Employee;
import com.sw.comps.Person;
import com.sw.comps.Student;

public class PersonFactory {
	public static Person getPerson(String personType){
		Person person = null;
		//create person object according to type provided by user
		if(personType.equalsIgnoreCase("student")){
			person = new Student();
		}
		else if(personType.equalsIgnoreCase("employee")){
			person = new Employee();
		}
		return person;
	}

}
