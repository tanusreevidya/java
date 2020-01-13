package com.crt.test;

class Outer
{
	int x=10;
	static int y=20;
	static class Inner
	{
		public void display()
		{
			System.out.println(y);
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		Outer.Inner in= new Outer.Inner();
		in.display();

	}

}
