package com.crt.solutions;
import java.util.Scanner;
public class Ones
{
 public static void main(String[] args)
 {
   int a,b,i,num,r,count=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter first number");
   a=sc.nextInt();
   System.out.println("enter last number");
   b=sc.nextInt();
   for(i=a;i<=b;i++)
   {
	  r=i;
	  while(r>0)
	  {
	  num=r%10;
	  if(num==1)
	  {
	   count++;
	  }
	  r=r/10;
	  }
   }
   System.out.println(count);
 }
}
