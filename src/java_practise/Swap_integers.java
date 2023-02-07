package java_practise;

public class Swap_integers 
{
	public static void main(String args[])
	{
		int x=5; //0101
		int y=10;//1010
		int t;
		//1.using 3rd variable
//		t=x;
//		x=y;
//		y=t;
//		System.out.println("X value is "+x+" Y value is "+y);
//		
		//2.without using 3rd variable
//		x=x+y;
//		y=x-y;
//		x=x-y;
//		System.out.println("X value is "+x+" Y value is "+y);
		
		//3.using * operator
//		x=x*y;
//		y=x/y;
//		x=x/y;
//
//		System.out.println("X value is "+x+" Y value is "+y);
		
		//4.using XOR 
		x=x^y;//1111
		y=x^y;//0101
		x=x^y;//1010
		System.out.println("X value is "+x+" Y value is "+y);
		
	}


}
