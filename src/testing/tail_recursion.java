package testing;

public class tail_recursion 

{
	 void recursion1(int b)
	
	{
		System.out.println(b+"value"+"comes here");
		if(b > 0)
		{
			
			recursion1(b-1);
			System.out.println("printing b "+b);
		}
		else
		{
			return;
		}
		
			
	}
	
	

	public static void main(String[] args)
	{
		tail_recursion obj=new tail_recursion();
		int x=4;
		obj.recursion1(x);
		
		
	}

}
