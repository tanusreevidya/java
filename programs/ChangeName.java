package com.cts.test;
import java.util.Scanner;
public class ChangeName
{
 public static void main(String[] args)
 {
  int a[],size,i,b[];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size");
  size=sc.nextInt();
  a=new int[size];
  b=new int[size];
  System.out.println("enter the elements");
  for(i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  for(i=0;i<size;i++)
  {
	  b[i]=a[i];
	  System.out.println("FIRST ARRAY"+a[i]);
	  System.out.println("SECOND ARRAY"+b[i]);
  }
 }
}
