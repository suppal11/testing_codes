package testing;

 class A
{
	
	A(int i)
	{
		System.out.print("Hi im here");
	}
}

class B extends A
{
	int j;
	public B()
	{
		super(10);
	}
}

public class helloworld 
{
	 
	int i=40;
	public int y=10;
	protected int x=10;
	//private int z=10;
	
public static void main(String args[])
{
	System.out.println("Hello world");
	B b=new B();
}
}
