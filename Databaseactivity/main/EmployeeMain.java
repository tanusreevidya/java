package com.crt.activity.main;
//import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;


public class EmployeeMain
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id :");
		int id= Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		String name=sc.nextLine();
			Class.forName("com.mysql.jdbc.Driver");
	        
			String url="jdbc:mysql://localhost:3306/cts";
			String username="root";
			String password="admin";
			
			Connection conn = DriverManager.getConnection(url, username, password);
			String query = "insert into employee values(?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			
			int result= ps.executeUpdate();
			if(result>0)
			{
				System.out.println("data Inserted successfully");
			}
			else
			{
				System.out.println("Try Again");
			}
//			Statement stmt = conn.createStatement(); 
//			String query = "insert into employee values(101,'tanu')";
//			String query = "update employee set name='manu' where id=102";
//			//String query ="delete from employee where id=102";
//			//int result = stmt.executeUpdate(query);
//			//if(result>0)
//			//{
//			//	System.out.println("Data Deleted Succesfully");
//			//}
//			//else
//			//{
//			//	System.out.println("Try Again");
//			//}
//			//System.out.println("Connection Established");
//			String query ="select *from employee";
//			ResultSet rs = stmt.executeQuery(query);
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+":"+rs.getString("name"));
//			}
//			
			sc.close();
	}

}
