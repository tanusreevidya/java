package com.crt.solutions;

public class Cases
{

	public static void main(String[] args)
	{
		String str="Global warming",str1;
		System.out.println(str.substring(str.length()-4));
		System.out.println(str.substring(4,8));
		System.out.println(str.matches("[a-zA-Z0-9]+"));
		System.out.println(str.substring(0,str.length()-4));
		System.out.println(str.substring(4));
		System.out.println(str.indexOf("wa"));
		/*for(int i=0;i<str.length();i++)
		{
         char ch=str.charAt(i);		
		if(ch.isLowerCase(ch))
		{
	     ch=ch.toUpperCase();
	     System.out.println(str1);
		}
		else
		{
		 str1=str.toLowerCase();
		 System.out.println(str1);
		}
		}*/
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('a','*'));
	}

}
