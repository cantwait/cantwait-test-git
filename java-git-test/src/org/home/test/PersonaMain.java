package org.home.test;

public class PersonaMain {

	public static void main(String[] args) {
		System.out.println("THIS IS A USEFULL APP");
		System.out.println("---------------------");
	}
	
	public static String getPersonIdAndName(){
		return new Persona("1","Rafael").getName();
	}

}
