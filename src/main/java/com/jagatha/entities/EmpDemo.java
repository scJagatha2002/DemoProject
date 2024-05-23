package com.jagatha.entities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmpConfig.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getAddress());
		
		System.out.println();
		
		Address address = (Address) context.getBean("address");
		System.out.println(address.getCity());
		System.out.println(address.getState());
		
		System.out.println();
		
		String beans[] = context.getBeanDefinitionNames();
		for(String bean : beans) {
			System.out.println(bean);
		}

	}

}
