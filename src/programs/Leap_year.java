package programs;

public class Leap_year
{

	public static void main(String[] args) 
	{
		int year=2020;
		boolean leap=false;
		if(year % 4==0)
		{
			if(year % 100==0)
			{
				if(year % 400==0)
				{
					leap=true;
				}
				else
				{
					leap=false;
				}
			}
			else
			{
			leap=true;	
			}
		}

		else
		{
			leap=false;
		}
		System.out.print("yes or not leap"+leap);
		}
	}

