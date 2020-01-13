package com.crt.test;
interface Wa
{
	void display();
}
public class InnerDemo4 {
	public static void main(String[] args) {
		Wa t=new Wa()
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
