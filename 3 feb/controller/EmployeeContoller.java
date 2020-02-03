package com.cts.training.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContractualEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermanentEmployee;

public class EmployeeContoller {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("Tanu Sree Vidya");
		
		PermanentEmployee pe = new PermanentEmployee();
		pe.setSalary(263414);
		pe.setBonus(137563F);
		
		ContractualEmployee ce = new ContractualEmployee();
		ce.setPayPerHour(2000);
		ce.setContractPeriod(12F);
		
		
//		List<String> emails = new ArrayList<String>();
//		Map<String, String> emails = new LinkedHashMap<>();
//		Set<String> emails = new HashSet<String>();
//		emails.add("tanu@gamil.com");
//		emails.add("tanu@yahoo.com");
//		emails.add("tanu@cts.com");
//		employee.setEmails(emails);
		session.save(employee);
		session.save(pe);
		session.save(ce);
		
		tx.commit();
		session.close();
	}

}
