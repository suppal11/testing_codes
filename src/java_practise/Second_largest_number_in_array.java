package java_practise;

public class Second_largest_number_in_array 
{

	static int cal_secondlargest(int[] input)
	{
		int firstlargest,secondlargest;
		if(input[1]>input[0])
		{
			secondlargest=input[0];
			firstlargest=input[1];
		}
		else
		{
			firstlargest=input[0];
			secondlargest=input[1];
		}
		for(int i=2;i<input.length;i++)
		{
			if(input[i]>firstlargest)
			{
				
				secondlargest=firstlargest;
				firstlargest=input[i];
			}
			else if(secondlargest<input[i] && input[i]<firstlargest)
			{
				secondlargest=input[i];
			}
		}
		return secondlargest;
	}
	
	public static void main(String[] args) 
	{
		System.out.print(cal_secondlargest(new int[] {45, 51, 28, 75, 49, 42}));
		

	}

}
