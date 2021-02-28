package com.sw.main;

import java.util.Scanner;

import com.sw.comps.Person;
import com.sw.factory.PersonFactory;

public class FactoryPatternTest {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		//take the person type from the console
		System.out.print("Enter Person Type : ");
		String personType = scn.nextLine();

		//get the person object by passing the person type
		Person person = PersonFactory.getPerson(personType);

		//call the method
		person.checkType();
		
		scn.close();
	}
}
