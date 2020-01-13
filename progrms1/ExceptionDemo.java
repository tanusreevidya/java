package com.crt.test;

public class ExceptionDemo {
	public static void main(String[] args) {
			
	try
	{
		System.out.println("Begin");
		int a=Integer.parseInt(args[0]);
		int b=10/(10-a);
		System.out.println(b);
		ExceptionDemo ed=new ExceptionDemo();
		ed.display();
		System.out.println("stop");
		throw new ArithmeticException("divided by zero");
	}
	catch (Exception ex)
	{
		System.out.println("exception occured");
	}
	

}
	public void display() throws NullPointerException
	{
		String name="aniket";
		//name=null;
		System.out.println("height:"+ name.length());
	}
}
