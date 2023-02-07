package testing;

public class static_variable_recursion 
{

	static int n=5;
	int recursion1(int b)

	{
		
		System.out.println(b+"value"+"comes here");
		if(b > 0)
		{

			return recursion1(b-1)+n;

		}
		else
		{
			return 0;
		}


	}

	public static void main(String[] args) 
	{
		static_variable_recursion obj=new static_variable_recursion();
		int x=4;
		System.out.print(obj.recursion1(x));


	}

}
