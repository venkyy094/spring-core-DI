package com.venkatesh.it.setter.injection;

public class Employee {
	private String name;
	private int id;
	private double salary;
	
	// other class: injecting address class object into this property
	
	private Address address;
	private PresentAddress presentAddress;;
	public Employee() {
		System.out.println("employee id created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PresentAddress getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(PresentAddress presentAddress) {
		this.presentAddress = presentAddress;
	}

	

}
