package com.crt.genereic;

public class GenericDemo<T>
{
	private T t;
    public T get()
    {
    	return this.t;
    }
    public void set(T t1)
    {
    	this.t = t1;
    }
    
	public static void main(String[] args)
	{
      GenericDemo<String> gd = new GenericDemo<String>();
      gd.set("tanu");
      System.out.println(gd.get());
     GenericDemo<Integer> gd1 = new GenericDemo<Integer>();
     gd1.set(22);
     System.out.println(gd1.get());
	
	}
}
