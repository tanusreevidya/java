package com.crt.solutions;
import java.util.Scanner;
public class Total
{
 public static void main(String[] args) 
 {
	 int i,num,total=0;
	 String name;
     //StringBuffer sb=new StringBuffer();
	 System.out.println("1.java       5000");
	 System.out.println("2.c          2000");
	 System.out.println("3.cpp        3000");
	 System.out.println("4.python     5000");
	 System.out.println("5.angular    5000");
	 Scanner sc=new Scanner(System.in);
     System.out.println("enter no of courses you need");
     num=Integer.parseInt(sc.nextLine());
     for(i=0;i<num;i++)
     {
      System.out.println("enter your courses");
      name=sc.nextLine();
      if(name.equals("java"))
      {
    	  total=total+5000;
      }
      if(name.equals("c"))
      {
    	  total=total+2000;
      }
      if(name.equals("cpp"))
      {
    	  total=total+3000;
      }
      if(name.equals("python"))
      {
    	  total=total+10000;
      }
      if(name.equals("angular"))
      {
    	  total=total+20000;
      }
     }
     System.out.println("total amount is"+total);
     sc.close();
 }
}
