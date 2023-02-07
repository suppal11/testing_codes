package testing;

class test123
{
	int x;
	test123(int i)
	{
		x=i;
	}
	test123()
	{
		x=0;
	}
}

class pass_by_ref
{

	public static void main(String[] args)
	{
		
		test123 ab=new test123(5);
		change(ab);
		System.out.println("\nOld value of x\n"+ab.x);
			
	}
	public static void change(test123 u)
	{
		u=new test123();
		u.x=25;
		System.out.print("\nNew value of x -->\n"+u.x);
	}

}
