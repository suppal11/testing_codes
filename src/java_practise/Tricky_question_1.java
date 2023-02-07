package java_practise;

public class Tricky_question_1 
{
	public static void main(String args[])
	{
		/*
		 * 
		 * output nos 1-100 without using any numbers in code
		 * 
		 * 
		 * 
		 * */
		int one='A'/'A';
		String s1="..........";
		for(int i=one;i<=s1.length()*s1.length();i++)
		{
			System.out.println(i);
		}
		//ASCII values a-97 b-98 c-99 d-100
		for(int i=one ;i<='d';i++)
		{
			System.out.println(i);
		}


		//2.How to print without using semicolon;

		if(System.out.printf("Hello World"+"\n")==null)
		{

		}

		if(System.out.append("Hello World"+"\n")==null)
		{

		}
		if(System.out.append("Hello World").equals(null))
		{

		}

		//Integer caching ranges over -128 to 127

		//if num1=100,num2=100


		//then num1==num2 will give true


		//Pass null argument in method overloading to string and object type

		//		psmv
		//		test(null);
		//		
		//		public static void test(Object o)
		//		{
		//			System.out.print("object");
		//		}
		//		public static void test(String o)
		//		{
		//			System.out.print("String");
		//		}
	}
}
