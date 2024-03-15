package com.java.association.vishal;

public class person {
	private String name;
	private int age;
	private address Address; // dependency
	

	public person(String name, int age, address address) {
		super();
		this.name = name;
		this.age = age;
		Address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public address getAddress() {
		return Address;
	}

	public void setAddress(address address) {
		Address = address;
	}

	
	public void displaydata()
	{
		System.out.println("Name of the person : "+name+"Age of the person : "+age+Address.getStreet() +Address.getCity() +Address.getState() +Address.getZipcode());
	}

}
