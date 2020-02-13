package com.cts.training.spring.contoller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.spring.dao.DataDAO;
import com.cts.training.spring.daoimpl.DataDAOImpl;
import com.cts.training.spring.model.Data;

public class DataController {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
		DataDAO dataDAO = (DataDAO) context.getBean("dataDAOImpl");
//		Data data = new Data(1, "tanu", "tanu123", "666", 49621462L);
//		System.out.println(dataDAO.addData(data));

		Data data = dataDAO.getDataById(1);
//		data.setName("sindhu");
//		boolean query= dataDAO.updateData(data);
//		if(query) {
//			System.out.println("updation successfull");
//		}else {
//			System.out.println("try again");
//		}
		
//		boolean query= dataDAO.deleteData(data);
//		if(query) {
//			System.out.println("deletion successfull");
//		}else {
//			System.out.println("try again");
//		}
		
		
	}

}
