package safehaven;

class multithreading1 implements Runnable{

	@Override
	public void run() {
		
		try
		{
			System.out.println("Thread is running"+Thread.currentThread().getId());
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
		
		
		
	}
	
}

public class Runnable_interface_extension
{

	public static void main(String args[])
	{
		
		int n=8;
		for(int i=0;i<n;i++)
		{
			
			Thread n1=new Thread(new multithreading1());
			System.out.println(n1.getState());
			n1.start();
			
			
		}
		
		
	}
	
}
