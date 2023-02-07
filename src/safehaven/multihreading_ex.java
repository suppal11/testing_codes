package safehaven;

class class1 extends Thread
{
public void run()
{
	try
	{
		System.out.println("Thread is running"+Thread.currentThread().getId());
		
	}
	catch(Exception e)
	{
		System.out.println("caught exception");
	}
}
}

public class multihreading_ex {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int n=8;
		for(int i=0;i<n;i++)
		{
			class1 obj=new class1();
			obj.start();
		}

	}

}
