package com.crt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI
{
  public static void main(String[] args) 
  {
   List<String> names = new ArrayList<String>();
   addNames(names);
   
    names.forEach(System.out::println);
    
    List<String> lengthScale = names.stream().filter(s -> s.length() > 7).collect(Collectors.toList());
    System.out.println("The names which has length Greater than 7 : \n");
    lengthScale.forEach(System.out::println);
    
    //print all the names i Captial letters
    List<String> capNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
    System.out.println("The names in capital letters");
    capNames.forEach(System.out::println);
    
  }

  private static void addNames(List<String> names) 
  {
	names.add("Abin Joshy");
	names.add("Sai Krishna");
	names.add("Aniket Andhale");
	names.add("NagaSri");
	names.add("Syed");
	
  }
}
