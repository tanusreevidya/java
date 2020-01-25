package com.cts;

import java.util.Scanner;

public class Roots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		double root1,root2;
		double determinant = ((b*b)-(4*a*c));
		if(determinant>0) {
			root1 = ((-b + Math.sqrt(determinant))/(2*a));
			root2 = ((-b - Math.sqrt(determinant))/(2*a));
			System.out.println("root1 is"+root1 +", root2 is" + root2);
		}
		else if(determinant==0) {
			root1 = (-b/(2*a));
			
			System.out.println("root1 is"+root1);

		}
		else {
			root1=(-b/(2*a));
			root2=(Math.sqrt(-determinant)/(2*a));
		   
			System.out.println("real part is"+root1 +", imaginary is" + root2);

		}
      
		
	}

}
