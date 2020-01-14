package com.crt.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateDemo2 
{
	public static void main(String[] args) 
	{
LocalDate today=LocalDate.now();
		
		LocalDate next=today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Today's date is :"+today);
		System.out.println("1 week Later date is :"+next);
	}

}
