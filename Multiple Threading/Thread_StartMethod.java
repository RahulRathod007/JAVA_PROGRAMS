//Example Of Multi-Threading Using Start() Method.
class A extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.printf("First Thread %d\n",i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=2;i<=10;i++)
			{
				System.out.printf("Second Thread %d\n",i);
				Thread.sleep(10000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
	}
}
public class Thread_StartMethod
{
	public static void main(String x[])
	{
		A a1 = new A();
		a1.start();
		
		B b1 = new B();
		b1.start();
		
	}
}