package com.crt.test;

class Local
{
	int x=10;
	static int y=20;
	class Inner1
	{
		public void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
}
public class InnerDemo1 {

	public static void main(String[] args) {
		Local out= new Local();
		Local.Inner1 in= out.new Inner1();
		in.display();

	}

}

