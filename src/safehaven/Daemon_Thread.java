package safehaven;

class u1 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("this is user thread");
		}
		
	}
}

class u2 extends Thread
{
	public u2()
	{
		setDaemon(true);
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("this is daemon thread");
		}
		
		
	}
}

public class Daemon_Thread {

	public static void main(String[] args) {
		u1 obj1=new u1();
		obj1.start();
		u2 obj2=new u2();
		obj2.start();

	}

}
