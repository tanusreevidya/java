package com.crt.test;
class Test
{
	public void display()
	{
		System.out.println("hello");
	}
}
public class InnerDemo2 {
	public static void main(String[] args) {
		Test t=new Test()
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
