package programs;

public class number_of_digits {

	public static void main(String[] args) 
	{
		int r=0;
		double rev_num=0;
		int num=12345;
		int num2=12345;
		int ct=0;
		int i=0;
		while(num2>0)
		{
			r=num2%10;
			num2=num2/10;
			rev_num=rev_num*10+r;
			i++;
			
		}
		
		System.out.print("No of digits"+i);
		
		System.out.println("Reversal"+rev_num);

	}

}
