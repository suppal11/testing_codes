package testing;

class base
{
	public static void m1()
	{
		System.out.println("base m1");
	}
	public void m2()
	{
		System.out.println("base m2");
	}
	
}

class Derived extends base
{
	public static void m1()
	{
		System.out.println("Derived m1");
	}
	public void m2()
	{
		System.out.println("Derieved m2");
	}
	
}


public class overiiding_in_java {

	public static void main(String[] args) {
		
		base b=new Derived();
		b.m2();
		b.m1();
		
		Derived d=new Derived();
		d.m1();
		d.m2();
		

	}

}
