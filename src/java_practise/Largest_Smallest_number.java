package java_practise;

public class Largest_Smallest_number 
{
	public static void main(String[] args)
	{
		int numbers[]= {5,10,40,90,2,3};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(largest<numbers[i])
				largest=numbers[i];
			else if(smallest>numbers[i])
				smallest=numbers[i];
		}
		System.out.println("largest number "+largest+"smallest number "+smallest);
	}
}
