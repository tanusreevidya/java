package cm.crt.training.lambda;

public class LambdaExpressions 
{
	public static void main(String[] args) 
	{
	  	Runnable  h= () -> System.out.println("helllo");
        Thread t = new Thread(h);
        t.start();
	}

}

@FunctionalInterface
interface Hello
{
	public void display();
}
