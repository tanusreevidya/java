package com.crt.activity.main;
import java.util.List;

import com.crt.activity.bean.*;
import com.crt.activity.dao.EmployeeDAO;
import com.crt.activity.daoimpl.EmployeeDAOImpl;


public class EmployeeMain
{
	public static void main(String[] args) 
	{
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		//Employee emp = employeeDAO.getEmployeeById(303);
		//System.out.println(emp);
		 
		
	   Employee employee = new Employee(306,"kanu","mum",99999999L);
	   
	   boolean status = employeeDAO.addEmployee(employee);
	   
	   if(status)
	   {
		   System.out.println("added succesfully");
	   }
	   else
	   {
		   System.out.println("ty again");
	   }
	   Employee deleteEmployee = employeeDAO.getEmployeeById(306);
	   boolean result = employeeDAO.deleteEmployee(deleteEmployee);
	   if(result)
	   {
		   System.out.println("deleted succesfully");
	   }
	   else
	   {
		   System.out.println("try again");
	   }
       Employee updateEmployee = employeeDAO.getEmployeeById(300);
       updateEmployee.setAddr("dsnr");
       boolean res = employeeDAO.updateEmployee(updateEmployee);
       if(res)
       {
    	   System.out.println("update succesfull");
       }
       else
       {
    	   System.out.println("try again");
       }
	   List<Employee> list = employeeDAO.getAllEmployees();
	   for(Employee employee2 : list)
	   {
		   System.out.println(employee2);
	   }
	   
	}

}
