package org.home.test;

public class PersonaMain {

	public static void main(String[] args) {
		System.out.println("THIS IS A USEFULL APP");
		System.out.println("---------------------");
		System.out.println("Id Persona: "+ getPersonId());
		
	}
	
	public static String getPersonId(){
		return new Persona("1").getId();
	}

}
