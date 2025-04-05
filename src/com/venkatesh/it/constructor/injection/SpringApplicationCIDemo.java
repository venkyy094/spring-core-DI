package com.venkatesh.it.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplicationCIDemo {

	public static void main(String[] args) {
			ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\venky\\Downloads\\java latest\\eclipse\\eclipse files\\spring-beans-DI\\spring-beans-di-ci.xml");
			
			Patient p1	=  (Patient) container.getBean("patient1");
			System.out.println(p1);
			Patient p2	=  (Patient) container.getBean("patient2");
			System.out.println(p2);

	}

}
