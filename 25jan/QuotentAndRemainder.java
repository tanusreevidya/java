package com.cts;

import java.util.Scanner;

public class QuotentAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numerator and denominator");
		int num = sc.nextInt();
		int den = sc.nextInt();
		int rem = num%den;
		int quo = num/den;
		System.out.println("Quotient is"+quo+"remainder is"+rem);

	}

}
