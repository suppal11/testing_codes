package java_practise;

public class prime_number {
//finding out the whether a number is prime 
	public static boolean cal_prime(int num)
	{
		int i;
		if (num<=1)
		{
			return false;
		}
		else
		{
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					return false;
				}	
			}

		}
		return true;
	}
	//finding out series of prime numbers 

	public static void get_primelist(int num2)
	{
		for(int i=2;i<=num2;i++)
		{
			if(cal_prime(i))
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) 
	{
		//System.out.println(cal_prime(8));
		get_primelist(13);
	}

}
