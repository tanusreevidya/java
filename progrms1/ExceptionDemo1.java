package com.crt.test;

public class ExceptionDemo1 {
 public static boolean isValidUser(String name) throws InvalidUser
 {
	 if(name.matches("admin"))
	 {
		 throw new InvalidUser("you are invalid");
	 }
	 return true;
 }
 public static void main(String[] args) {
	try
	{
		isValidUser("tanu");
	}
	catch(InvalidUser ex)
	{
		System.out.println(ex.getMessage());
	}
}
}
class InvalidUser extends Exception
{
	InvalidUser()
	{
		
	}
	InvalidUser(String msg)
	{
		System.out.println(msg);
	}
	public String getMessage()
	{
		return "heelo";
	}
}
