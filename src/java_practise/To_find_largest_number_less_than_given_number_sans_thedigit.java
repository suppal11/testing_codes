package java_practise;

public class To_find_largest_number_less_than_given_number_sans_thedigit 
{
	static int getLLessThanN(int num,int digit)
	{
		//converting digit to String
		String c=Integer.toString(digit);
		for(int i=num;i>0;i--)
		{
			if(Integer.toString(i).indexOf(c)==-1)
			return i;
		}
		

		return -1;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(getLLessThanN(123, 2));
        System.out.println(getLLessThanN(4582, 5));
        


	}

}
