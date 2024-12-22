package com.springcore.constructorinjection;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	
	public Person(String name,int personId,Certi certi) {
		this.personId=personId;
		this.name=name;
		this.certi=certi;
	}
	
	public String toString() {
		return this.name+" : "+this.personId+"{"+this.certi.name+"}";
	}
}
