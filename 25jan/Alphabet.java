package com.cts;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		  char a=sc.next().charAt(0);
		  if((a>='a' && a<='z') ||(a>='A' && a<='Z'))
		  {
			  System.out.println(a +" is an Alphabet");
		  }
		  else {
			  System.out.println(a +" is not an Alphabet");
		  }
	}

}
