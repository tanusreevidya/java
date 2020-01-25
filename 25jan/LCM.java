package com.cts;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		int first,second,gcd=1,lcm;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		first=sc.nextInt();
		System.out.println("enter the second number");
		second=sc.nextInt();
		for(int i=1;i<=first && i<=second;i++) {
			if(i%first==0 && i%second==0) {
				gcd=i;
			}
		}
	    
		lcm=((first*second)/gcd);
		System.out.println("LCM of "+first +" & "+ second +" is "+lcm);
	
	
	}
	

}
