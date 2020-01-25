package com.cts;

import java.util.Scanner;

public class SumNatural {

	public static void main(String[] args) {
		int num,i,sum=0;
		Scanner sc = new Scanner(System.in);
		num =sc.nextInt();
		for( i=1;i<=num;i++) {
			sum = sum+i;
		}
		System.out.println("sum of "+num+" numbers is"+sum);
	}

}
