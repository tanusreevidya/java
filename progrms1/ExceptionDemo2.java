package com.crt.test;

public class ExceptionDemo2 {
 public static boolean licensed(String code) throws Driver
 {
	 if(!code.matches("[a-zA-Z0-9]+"))
	 {
		 throw new Driver("Invalid Drivers license");
	 }
	 else
	 {
		 System.out.println("valid");
	 }
	 return true;
 }
 public static void main(String[] args) {
	try
	{
		licensed("Abc123");
	}
	catch(Driver d)
	{
		System.out.println(d.getMessage());
	}
}
}
class Driver extends Exception
{
	Driver()
	{
		
	}
	Driver(String msg)
	{
		System.out.println(msg);
	}
	public String getMessage()
	{
		return "Not a licenced Driver";
	}
}
