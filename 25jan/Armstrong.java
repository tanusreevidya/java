package com.cts.two;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
       int num,snum,digit,res=0,count=0;
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number");
		 num =sc.nextInt();
		 snum=num;
		 while(num!=0) {
			 count++;
			 num=num/10;
		 }
		 while(num!=0) {
			 digit=num%10;
			double cube= Math.pow(digit,count); 
			 res+=cube;
			 num=num/10;

		 }
		 System.out.println(res);
		 if(res==snum) {
			 System.out.println(snum+" is an Armstrong number");
		 }
		 else {
			 System.out.println(snum+" is not an Armstrong number");
		 }
	}

}
