package cm.crt.training.thread;

public class SynDemo 
{

	public static void main(String[] args) 
	
	{
		Resource resource = new Resource();
		System.out.println("Main Thread");
		Thread t = Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY);
		FirstThreeead ft =new FirstThreeead(resource);
		SecooondThread st= new SecooondThread(resource);
		Thread t1= new Thread(ft);
		Thread t2 = new Thread(st);
		t2.setPriority(Thread.MIN_PRIORITY+2);
		t1.start();
		t2.start();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
	}

}
class FirstThreeead implements Runnable
{
		Resource resource;
		
		public FirstThreeead(Resource resource)
		{
			this.resource = resource;
		}
		public void run()
		{
	     resource.display("first thread");
		}
		    
}
class SecooondThread implements Runnable
{
	Resource resource;
	
	public SecooondThread(Resource resource)
	{
		this.resource = resource;
	}
	public void run()
	{
     resource.display("second thread");
	}
}


class Resource
{
	public void display(String msg)
	{
		synchronized(this)
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println(msg + ":" +i);
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		}
	}
}