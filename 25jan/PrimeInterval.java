package com.cts.two;

import java.util.Scanner;

public class PrimeInterval {

	public static void main(String[] args) {
		int count=0,first,second;
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter first number of interval");
		 first=sc.nextInt();
		 System.out.println("enter last number of interval");
		 second=sc.nextInt();
		 for(int num=first; num<=second;num++) {
			 count=0;
		  for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		  }
			if(count==2) {
				System.out.println(num+" ");
			}
		}
		 }

	}

