package programs;

import java.util.Scanner;

public class vowel_consonant
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String c=sc.next().toLowerCase();
//		if("aeiou".contains(c))
//		{
//			System.out.println("Vowel");
//		}
//		else
//		{
//			System.out.println("Consonent");
//		}
		switch(c)
		{
		case "a":
			System.out.println(c+"is vowel");
			break;
		case "e":
			System.out.println(c+"is vowel");
			break;
		case "i":
			System.out.println(c+"is vowel");
			break;
		case "o":
			System.out.println(c+"is vowel");
			break;
		case "u":
			System.out.println(c+"is vowel");
			break;
			default:
				System.out.println(c+"is consonant");
				break;
				
		}
		
		

	}

}
