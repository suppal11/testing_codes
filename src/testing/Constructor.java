package testing;

public class Constructor 
{
	String a;
	int b;
	Constructor(String x,int y)
	{
		a=x;
		b=y;
		System.out.println("value in constructor"+"\t"+ a+ "\t"+b);
		return;
		
		
	}

	public static void main(String[] args) 
	{
		Constructor con=new Constructor("abc",10 );

	}

}
