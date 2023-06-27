package demo;

public class RunnableDemo implements Runnable {
	Thread t;
	
	public void run()
	{	try {
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread: "+i);
			Thread.sleep(1000);
		}
	}
		catch(InterruptedException e)
		{
			
		}
	}
	public static void main(String args[])
	{
		Thread t1=new Thread(new RunnableDemo() );
		t1.start();
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println("Main: "+i*i);
				Thread.sleep(1500);
			}
		}
			catch(InterruptedException e)
			{
				
			}
	}
		
	}


