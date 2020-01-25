package com.cts.two;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int pow,num,res = 1;
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number");
		 num =sc.nextInt();
		 System.out.println("enter power");
		 pow=sc.nextInt();
		while(pow!=0) {
			
			res*=num;
			pow--;
		}
      System.out.println(res);
	}

}
