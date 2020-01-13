package com.crt.test;
class Car
{
	int x=10;
	public void display()
	{
     class Member
     {
    	 public void show()
    	 {
    		 class Engine
    		 {
    			 public void s()
    			 {
    		 System.out.println(x);
    		 }
    		 }
    		 Engine e=new Engine();
    		 e.s();
    	 }
     }
     Member m=new Member();
     m.show();
	}
}
public class Demo {

	public static void main(String[] args) {
		Car c=new Car();
		c.display();
	}

}
