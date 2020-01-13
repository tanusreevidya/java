package com.crt.solutions;

import java.util.Scanner;

public class Total1 {

	public static void main(String[] args) 
	{
		 int price=0;
		 System.out.println("1.java       5000");
		 System.out.println("2.c          2000");
		 System.out.println("3.cpp        3000");
		 System.out.println("4.python     5000");
		 System.out.println("5.angular    5000");
		 Scanner sc=new Scanner(System.in);
		 StringBuffer sb=new StringBuffer();
		 String choice =sc.nextLine();
      	 String course = choice;
		 if(course.contains("java"))
		 {
			 sb.append("java     5000");
			 price=price+5000;
		 }
		 if(course.contains("c"))
		 {
			 sb.append("c     2000");
			 price=price+2000;
		 }
		 if(course.contains("cpp"))
		 {
			 sb.append("cpp     3000");
			 price=price+3000;
		 }
		 if(course.contains("python"))
		 {
			 sb.append("python     10000");
			 price=price+10000;
		 }
		 if(course.contains("angular"))
		 {
			 sb.append("angular     20000");
			 price=price+20000;
		 }
	
		 System.out.println(price);
	}
}