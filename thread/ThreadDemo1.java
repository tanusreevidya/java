package cm.crt.training.thread;

public class ThreadDemo1
{
  public static void main(String[] args) 
  {
	System.out.println("Main Thread");
	
	FirstThread ft =new FirstThread();
	SecondThread st= new SecondThread();
	ft.start();
	st.start();
	
  }
}
class FirstThread extends Thread
{
	public void run()
	{
		for(int i=1 ; i<=5;i++)
        {
			if(i%2!=0)
			{
	       System.out.println("FIRST THREAD" + i);
			}
	       try 
	       {
			Thread.sleep(2000);
		    } 
	       catch (InterruptedException e)
	       {
 			e.printStackTrace();
		   }
         }
	}
}
class SecondThread extends Thread
{
	public void run()
	{
		for(int i=1 ; i<=5;i++)
        {
			if(i%2==0)
			{
	       System.out.println("SECOND THREAD" + i);
			}
			try 
	       {
			Thread.sleep(2000);
		    } 
	       catch (InterruptedException e)
	       {
 			e.printStackTrace();
		   }
         }
	}
}
