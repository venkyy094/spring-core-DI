package com.venkatesh.it.constructor.injection;

public class Patient {
	
		private int patientId;
		private String name;
		private long mobile;
		
		public Patient() {
			System.out.println("this is default constructor");
			
		}
		
		public Patient(int patientId, String name, long mobile) {
			super();
			this.patientId = patientId;
			this.name = name;
			this.mobile = mobile;
		}

		@Override
		public String toString() {
			return "Patient [patientId=" + patientId + ", name=" + name + ", mobile=" + mobile + "]";
		}
		
		
		

}
