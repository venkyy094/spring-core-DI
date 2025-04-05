package com.venkatesh.it.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplicationWithDI {

	public static void main(String[] args) {
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\venky\\Downloads\\java latest\\eclipse\\eclipse files\\spring-beans-DI\\spring-beans.xml");
		
		Address address1 = (Address) container.getBean("office");
		System.out.println(address1);
		
		Employee employeeOne = (Employee) container.getBean("emp1");
		System.out.println(employeeOne.getId());
		System.out.println(employeeOne.getName());
		System.out.println(employeeOne.getSalary());
		System.out.println(employeeOne.getAddress());
		System.out.println(employeeOne.getPresentAddress());
		
		
		//PresentAddress paddr = (PresentAddress) container.getBean("presentAdd");
		//System.out.println(paddr);
	
		
	}

}
