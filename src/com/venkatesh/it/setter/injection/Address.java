package com.venkatesh.it.setter.injection;

public class Address {
	
	private int pincode;
	private String city;
	private String country;
	public Address() {
		System.out.println("Address is created");
		
		
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		System.out.println("Address is calling setPincode:"+pincode);
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("Address is calling city:"+city);
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		System.out.println("Address is calling country:"+country);
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
