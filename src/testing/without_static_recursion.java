package testing;

public class without_static_recursion
{

	int recursion1(int b)

	{
		System.out.println(b+"value"+"comes here");
		if(b > 0)
		{

			return recursion1(b-1)+b;

		}
		else
		{
			return 0;
		}


	}

	public static void main(String[] args) 
	{
		without_static_recursion obj=new without_static_recursion();
		int x=4;
		System.out.print(obj.recursion1(x));


	}
}
