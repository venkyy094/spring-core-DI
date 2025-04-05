package com.venkatesh.it;

public class Employee {
	
			public String companyName = "Venkatesh IT";
			public String infoEmailId = "xyz@gmail.com";
			public int empId;
			public String empName;
			
			
			
			

			public Employee() {
				System.out.println("Employee object created");
			}
			
			public void printEmpInformation() {
				System.out.println(companyName);
				System.out.println(infoEmailId);
				System.out.println(empId);
				System.out.println(empName);
			}

	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.printEmpInformation();
	}
		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getInfoEmailId() {
			return infoEmailId;
		}

		public void setInfoEmailId(String infoEmailId) {
			this.infoEmailId = infoEmailId;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			System.out.println("setter of employee id called");
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			System.out.println("setter of employ name called");
			this.empName = empName;
		
		

	}

}
