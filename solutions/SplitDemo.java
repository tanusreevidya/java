package com.crt.solutions;

public class SplitDemo {

	public static void main(String[] args)
	{
		String date= "Thursday 9 january 2020";
		String[] dates=date.split("\\d");
		for(String m : dates)
		{	
		 System.out.println(m);
		}

	}

}
