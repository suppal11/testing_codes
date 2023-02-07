package safehaven;

class m1 extends Thread
{
	public m1(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("from"+getName());
		}
	}
}

public class setpriority {

	public static void main(String[] args) {
		m1 new1=new m1("Thread1");
		new1.setPriority(5);
		new1.start();
		
		m1 new2=new m1("Thread2");
		new2.setPriority(7);
		new2.start();

	}

}
