package safehaven;

class m1 extends Thread
{
	public m1(String n1)
	{
		super(n1);
	}
	
	public void run()
	{
		System.out.println(getName());
	}
}

public class Superclass_naming
{

	public static void main(String args[])
	{
		m1 n=new m1("Hi");
		
		n.start();
		
	}
	
}
