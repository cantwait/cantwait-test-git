package org.home.test;

public class PersonaMain {

	public static void main(String[] args) {
		System.out.println("THIS IS A USEFULL APP FOR TESTING");
		System.out.println("---------------------");
		System.out.println("Persona nombre: " + getPersonIdAndName());
	}
	
	public static String getPersonIdAndName(){
		return new Persona("1","Rafael").getName();
	}

}
