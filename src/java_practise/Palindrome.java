package java_practise;

public class Palindrome 
{
	//to find out the rev of number is original number

	public static void cal_palindrome(int num)
	{
		int t;
		int rev=0;
		t=num;

		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;

		}
		if(rev==t)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
	public static void main(String[] args) 
	{
		cal_palindrome(414);
	}

}
