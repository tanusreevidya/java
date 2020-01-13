package com.crt.test;
import java.util.Scanner;
public class InheritanceDemo
{
 public static void main(String[] args) 
 {
   Employee emp=new Employee();
   emp.getData();
   Manager man=new Manager();
   man.getData();
   Developer dev=new Developer();
   dev.getData();
   emp.display();
   man.display();
   dev.display();
 }
}
class Employee
{
	int id;
	String name;
	String company;
	
	public void display()
	{
		System.out.println(id+":"+name+":"+company);
	}
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		id=Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter company");
		company=sc.nextLine();
		//sc.close();
	}
}
class Manager extends Employee
{
	int size,i;
	String team[];
	String department;
	public void getData()
	{
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the team");
		size=Integer.parseInt(sc.nextLine());
		team=new String[size];
		System.out.println("enter team members name");
		for(i=0;i<size;++i)
		{
			team[i]=sc.nextLine();
		}
		System.out.println("enter department");
		department=sc.nextLine();
		//sc.close();
	}
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the team");
		size=Integer.parseInt(sc.nextLine());
		for(i=0;i<size;i++)
		{	
		 System.out.println(team[i]+":"+ department);
		}
	}
}
class Developer extends Employee
{
	String projectname;
	String duration;
	String domain;
	public void display()
	{
		System.out.println(projectname +":"+ duration+":"+domain);
	}
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter projectname");
		projectname=sc.nextLine();
		System.out.println("enter duration");
		duration=sc.nextLine();
		System.out.println("enter domain");
		domain=sc.nextLine();
		//sc.close();
	}
}
