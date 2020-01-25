package com.cts;

import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) {
		int range,first,second,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range number");
		range =sc.nextInt();
		System.out.println("enter the first number");
		first=sc.nextInt();
		System.out.println("enter the second number");
		second=sc.nextInt();
		System.out.print(first+","+second);
         for(int i=first;i<= range;i++)
         {
        	sum=first+second;
        	System.out.print(","+sum);
        	first=second;
        	second=sum;
         }
	}

}
