package com.cts;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
        int num,i,mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		num =sc.nextInt();
		for(i=1;i<=10;i++) {
           mul=num*i;
           System.out.println(num+"*"+i+"="+mul);
		}
	}

}
