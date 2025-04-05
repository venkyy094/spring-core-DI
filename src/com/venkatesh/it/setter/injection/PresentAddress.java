package com.venkatesh.it.setter.injection;

public class PresentAddress {
	
	private int pincode;
	private String area;
	
	public PresentAddress() {
		
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "PresentAddress [pincode=" + pincode + ", area=" + area + "]";
	}
	

}
