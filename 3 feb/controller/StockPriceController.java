package com.cts.training.controller;
import com.cts.training.model.Register;
import com.cts.training.model.StockPrice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.cts.training.dao.StockPriceDAO;
import com.cts.training.dao.impl.StockPriceDAOImpl;
import com.cts.training.model.StockPrice;

public class StockPriceController {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		StockPrice stockPrice = new StockPrice(101, 101, 234234L, date,time);
		
		StockPriceDAO stockPriceDAO = new StockPriceDAOImpl();
		
		// creating table
		boolean status = stockPriceDAO.saveUser(stockPrice);
		if (status) {
			System.out.println("user Saved Successfully");
		} else {
			System.out.println("Try Again");
		}
		
		// updating user
//		Register getUser=userDAO.getUserById(101);
//		getUser.setEnabled(true);
//		getUser.setPassword("pavan@567");		
//		
//		boolean status = userDAO.updateUser(stockPrice);
//		if (status) {
//				System.out.println("Updated successfully");
//		}else {
//			System.out.println("Try Again");
//		}
		
		//deleting user
		
//		Register getUser=userDAO.getUserById(105);
//		boolean status = userDAO.deleteUser(getUser);
//		if(status) {
//			System.out.println("Deleted successfully");
//		}else {
//			System.out.println("Try Again");
//		}
		
		List<Register> getUser= userDAO.getAllUsers();
		getUser.forEach(System.out::println);
		


		
	}
}
