package com.crt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.crt.collections.Employee;

public class StreamAPI2 
{
	public static void main(String[] args) 
	{
		List<Employee> employees = new ArrayList<Employee>();
		addEmployees(employees);
		//employees.forEach(System.out::println);
		List<Employee> ageScale = employees.stream().map(emp -> {emp.setAge(emp.getAge() * 1.1); return emp;}).collect(Collectors.toList());
		ageScale.forEach(System.out::println);
		//List<Employee> nameLength = employees.stream().filter(emp -> emp.getName().length() > 4).collect(Collectors.toList());
		//nameLength.forEach(System.out::println);
		
	}

	private static void addEmployees(List<Employee> employees) 
	{
		
		 Employee emp1 = new Employee(103,"tanu sree","hyd",00000000L,23);
		 Employee emp2 = new Employee(100,"manu","dsnr",00003300L,22);
		 Employee emp3 = new Employee(107,"kanuko","ap",0550000L,50);
   		 employees.add(emp1);
		 employees.add(emp2);
	     employees.add(emp3);	
		
	}

}
