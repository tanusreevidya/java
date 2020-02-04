package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet {

	
		public static boolean validate(String name,String pass){
			boolean status=false;
			try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cts","root","admin");
			PreparedStatement ps=con.prepareStatement(
			"select * from register where email=? and password=?");
			ps.setString(1,name);
			ps.setString(2,pass);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			}catch(Exception e){System.out.println(e);}
			return status;
			}
		
		protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
		{
		
		    PrintWriter out = response.getWriter();
		    String name=request.getParameter("email");
		    String password=request.getParameter("pass");
		    Login ldb=new Login();
		    if(ldb.validate(name, password)){
		        RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
		        rd.forward(request,response);
		    }
		    else{
		        out.print("Sorry username or password error");
		        RequestDispatcher rd=request.getRequestDispatcher("login.html");
		        rd.include(request,response);
		    }
		    out.close();
				}
}
