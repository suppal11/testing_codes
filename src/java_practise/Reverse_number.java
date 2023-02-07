package java_practise;

public class Reverse_number 
{
	public static void main(String args[])
	{
		//1.Using algo
		long num=12345;
		long rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		//2.Using stringbuffer
		long num2=12345;
		
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
	}
	
}
