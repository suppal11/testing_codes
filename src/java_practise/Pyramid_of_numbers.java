package java_practise;

public class Pyramid_of_numbers
{

	public static void main(String[] args) 
	{
		int sp=20;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				for(int k=1;k<=sp;k++)
				{
                System.out.print(" ");
				}
				System.out.print(j);
				
			}
			System.out.println("\n");
			sp=sp-3;
		}

	}

}
