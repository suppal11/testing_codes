package safehaven;

class Thread1 extends Thread
{
	public void run()
	{
		for (int i=0;i<=100;i++)
		{
			System.out.println("inside 1");
		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		for (int j=101;j<=200;j++)
		{
			System.out.println("inside 2");
		}
	}
}


public class threading 
{

	public static void main(String[] args) 
	{
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();

	}

}
