package java_practise;

public class Missing_Number_in_array 
{
	public static void main(String args[])
	{
		int a[]= {-1,0,1,2,3,5,6};
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of given series "+sum);
		int sum1=0;
		for(int j=-1;j<=6;j++)
		{
			sum1=sum1+j;
		}
		System.out.println("Sum of entire series including missing number "+sum1);
		System.out.println("missing number "+(sum1-sum));
	}
}
