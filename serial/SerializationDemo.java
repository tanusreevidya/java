package com.crt.serial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.crt.collections.Employee;

public class SerializationDemo 
{
	public static Object deserialize (String fileName) throws IOException, ClassNotFoundException
	{
		FileInputStream fin = new FileInputStream(fileName);
		BufferedInputStream bin = new BufferedInputStream(fin);
		ObjectInputStream oin = new ObjectInputStream(bin);
		Object obj = oin.readObject();
	  return obj;	
	}
	public static void serialize(Object obj, String fileName) throws IOException
	{
		FileOutputStream fout = new FileOutputStream(fileName);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		ObjectOutputStream out = new ObjectOutputStream(bout);
		out.writeObject(obj);
		out.close();
		bout.close();
		fout.close();
		
	}
	public static void main(String[] args) 
	{
	  Employee employee=  new Employee(1111, "Abhi", "Telangana",222222L,35);
	  try {
		serialize(employee, "serial.txt");
	
			Employee emp = (Employee) deserialize("serial.txt");
			System.out.println(emp);
	
	      }	
	  catch (ClassNotFoundException e)
	  {
			e.printStackTrace();
		}
        catch (IOException e)
	  {
	 
		e.printStackTrace();
	  }
	  
  
	}

}
