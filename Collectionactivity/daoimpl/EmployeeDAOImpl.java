package com.crt.activity.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.crt.activity.bean.Employee;
import com.crt.activity.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO  {
	
	static ArrayList<Employee> list=null;
	static
	{
		list = new ArrayList<Employee>();
		Employee emp1 = new Employee(300, "tanu", "hyd",99999999L);
		Employee emp2 = new Employee(303, "manu", "hyd",99999999L);
		list.add(emp1);
		list.add(emp2);
		
	}
	
	

	@Override
	public boolean addEmployee(Employee employee) {
		
		try {
		list.add(employee);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		for(Employee emp : list  )
		{
			if(emp.getId()==employee.getId())
			{
				list.set(list.indexOf(emp), employee);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		
		try {
			list.remove(employee);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		for(Employee employee : list) {
			if(employee.getId()== id) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return list;
	}
	

}
