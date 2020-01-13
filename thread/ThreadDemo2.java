package cm.crt.training.thread;

public class ThreadDemo2 {

	public static void main(String[] args) {
	

		System.out.println("Main Thread");
		Thread t = Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY);
		FirstThreead ft =new FirstThreead();
		SecoondThread st= new SecoondThread();
		Thread t1= new Thread(ft);
		Thread t2 = new Thread(st);
		t2.setPriority(Thread.MIN_PRIORITY+2);
		t1.start();
		t2.start();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
	  }
	}
	class FirstThreead implements Runnable
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
	class SecoondThread implements Runnable
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

