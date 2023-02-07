package java_practise;

public class swap_strings {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		System.out.println("Before swapping :");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		
		//1.append a and b
		a=a+b;
		
		//2.find out b from start of string now
		b=a.substring(0, a.length()-b.length());
		
		//3.find out a from 2nd half
		
		a=a.substring(b.length());
		
		System.out.println("After swapping :");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		
		

	}

}
