package com.crt.solutions;

public class SBDemo 
{
	public static void main(String[] args) 
	{
      StringBuffer sb=new StringBuffer();
      System.out.println(sb.capacity());
	  sb.append("THORIPAKKAM");
	  System.out.println(sb.capacity());
	  sb.insert(3," CHENNAI");
	  System.out.println(sb);
	  sb.replace(0, 3, "water");
	  System.out.println(sb);
	  sb.ensureCapacity(300);
	  System.out.println(sb.capacity());
	}

}
