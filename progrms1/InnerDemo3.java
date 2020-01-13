package com.crt.test;
abstract class Water
{
	abstract public void display();
}

public class InnerDemo3 {
	public static void main(String[] args) {
		Water t=new Water()
		{
			@Override
			public void display()
			{
				System.out.println("good mrng");
			}
		};
        t.display();
	}

}
