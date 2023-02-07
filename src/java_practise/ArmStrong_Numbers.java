package java_practise;

public class ArmStrong_Numbers 
{

	//Armstrong number=153=1*1*1+5*5*5+3*3*3
	public static void armstrong_cal(int num)
	{
		int t;
		int r=0;
		int cal_num=0;
		t=num;

		while(num>0)
		{
			cal_num=num%10;
			num=num/10;
			r=r+cal_num*cal_num*cal_num;
		}

		if(r==t)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}

	public static void main(String[] args) 
	{
		armstrong_cal(234);
	}

}
