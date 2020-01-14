package com.crt.date;

import java.util.Date;

public class DateDemo 
{
	public static void main(String[] args) 
	{
		  Date date = new Date();
		  System.out.println(date);
         int day= date.getDay();
         switch (day) {
		case 0: System.out.println("sunday  ");
			    break;
		case 1: System.out.println("monday");
          	    break;
		case 2: System.out.println("tuesday ");
	            break;

		default:System.out.println("invalid");
			    break;
		}
	}
}
