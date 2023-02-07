package java_practise;

public class Factorial 
{
	//1.without recursion

	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	//2.with recursion
	public static int factorial2(int num)
	{
		if(num<=1)
			return 1;
		else
			return num*factorial2(num-1);
	}


	public static void main(String[] args)
	{
		//System.out.println(factorial(5));
		System.out.println(factorial2(5));
	}

}
