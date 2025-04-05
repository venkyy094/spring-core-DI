package com.venkatesh.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\venky\\Downloads\\java latest\\eclipse\\eclipse files\\spring-beans-DI\\venkateshit.XML");
		Object obj = container.getBean("e1");
		Employee emp1 = (Employee)obj;
//		System.out.println("before values updated");
		emp1.printEmpInformation();
//		
//		System.out.println("after values updated");
		
		// after creating an object we are updating values by programmatically
//		emp1.empId =100;
//		emp1.empName ="venkatesh";
//		emp1.printEmpInformation();
		// now i dont want by program, spring itself update this values-setter method for injecting these values
		
		
		
	}

}
