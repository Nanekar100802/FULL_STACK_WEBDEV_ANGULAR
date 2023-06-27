package demo;

public class ThreadDemo extends Thread {
	Thread t;
	ThreadDemo()
	{
		t=new Thread();
		System.out.println("Thread created");
		t.start();
		System.out.println("Thread Run");
	}
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
		ThreadDemo t1=new ThreadDemo();
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


