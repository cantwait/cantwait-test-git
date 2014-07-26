package org.home.test;

import java.io.Serializable;

public class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2757293247887554869L;
	private String id;
	private String name;
	
	public Persona(){}
	
	public Persona(String id){
		this.id = id;
	}
	
	public Persona(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	

}
