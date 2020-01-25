package com.cts;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1,num,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		if(num==1) {
			System.out.println("factorial is 1");
		}
		else {
		 for(i=2;i<=num;i++) {
			fact=fact*i;
		}
		 System.out.println("factorial is "+fact);
		}
	}

}
