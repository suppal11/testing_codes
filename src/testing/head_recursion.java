package testing;

public class head_recursion 

{
	 void recursion1(int b)
	
	{
		 System.out.println(b+"value"+"comes here");
		if(b > 0)
		{
			System.out.println("printing b "+b);
			recursion1(b-1);
		}
		else
		{
			return;
		}
		
			
	}
	
	

	public static void main(String[] args)
	{
		head_recursion obj=new head_recursion();
		int x=4;
		obj.recursion1(x);
		
		
	}

}
