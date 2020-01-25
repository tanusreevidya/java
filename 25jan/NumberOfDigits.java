package com.cts.two;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
     int num,snum,count=0;
     Scanner sc = new Scanner(System.in);
	 System.out.println("enter a number");
	 num =sc.nextInt();
	 snum=num;
	 while(num!=0) {
		 
		 count++;
		 num=num/10;
	 }
	 System.out.println("number of digits in "+snum+" are "+count);
	}

}
