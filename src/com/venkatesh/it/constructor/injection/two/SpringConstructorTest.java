package com.venkatesh.it.constructor.injection.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringConstructorTest {

	public static void main(String[] args) {
		 	ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\venky\\Downloads\\java latest\\eclipse\\eclipse files\\spring-beans-DI\\spring-beans-ci-two.xml");
		 	
		 					CartItems cart			= (CartItems) container.getBean("cart1");
		 					System.out.println(cart);		
		 					
		 					
		 					CartItems cart3			= (CartItems) container.getBean("cart3");
		 					System.out.println(cart3.getItemNames());
		 					System.out.println(cart3.getName());
		 					System.out.println(cart3.getItemPrices());
		 					
		 					Order o1 = (Order) container.getBean("order1");
		 					System.out.println(o1.getEmailId());
		 					System.out.println(o1.getCartItems().getName());
		 					System.out.println(o1.getCartItems().getItemNames());
		 					System.out.println(o1.getCartItems().getItemPrices());
		 					


	}

}
