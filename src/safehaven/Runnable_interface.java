package safehaven;

class Interface1 implements Runnable
{

	@Override
	public void run() {
		System.out.print("inside run");
		
	}
	
}

public class Runnable_interface
{

	public static void main(String args[])
	{
		Interface1 obj=new Interface1();
		Thread t=new Thread(obj);
		//t.setDaemon(true);
		t.start();
		
		
		
		
	}
}
