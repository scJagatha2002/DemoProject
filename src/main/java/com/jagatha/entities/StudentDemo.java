package com.jagatha.entities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {
	
	public static void main(String args[]) { 
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
		
		Student student = (Student) context.getBean("student");
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
	}

}
