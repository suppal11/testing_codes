package java_practise;

public class Stringmanipulation
{

	public static void main(String[] args)
	{
		String str="Hi I have arrived";
		String str1="Hi i have arrived";
		String str2="   Hello World    ";
		//1.length
		System.out.println(str.length());
		//2.char at
		System.out.println(str.charAt(3));
		//3.index of
		System.out.println(str.indexOf("have"));
		//4.second occurece of i
		System.out.println(str.indexOf("i", str.indexOf("i")+1));
		//5.if substring is not present in string then -1 is retunred
		System.out.println(str.indexOf("hello"));

		//string comparision
		System.out.println(str.equals(str1));
		//ignore case
		System.out.println(str.equalsIgnoreCase(str1));
		//substring
		System.out.println(str.substring(0, 4));
		//trim
		System.out.println(str2.trim());
		//replace
		System.out.println(str2.replace(" ", ""));
		String date="10-20-2010";
		System.out.println(date.replace("-","/"));
		//split
		String test="Hello_World_Test_Selenium";
		String t1[]=test.split("_");	
		for(int i=0;i<t1.length;i++)
		{
			System.out.println(t1[i]);
		}
	}

}
