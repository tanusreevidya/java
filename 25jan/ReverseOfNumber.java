package com.cts.two;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int num,snum,rem,rev=0;
	     Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number");
		 num =sc.nextInt();
		 snum=num;
		 while(num!=0) {
			 
			 rem=num%10;
			 rev=rem+(rev*10);
			 num=num/10;
		 }
    System.out.println("reverse of "+snum+" is "+rev);
	}

}
