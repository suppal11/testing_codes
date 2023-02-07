package programs;

public class Swap_two_numbers 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int tmp;
		//tmp=a;
		//a=b;
		//b=tmp;
		//System.out.println("\ta\t"+a+"\tb\t"+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("\ta\t"+a+"\tb\t"+b);
		

	}

}
