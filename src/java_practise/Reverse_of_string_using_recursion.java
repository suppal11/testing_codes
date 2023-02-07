package java_practise;

public class Reverse_of_string_using_recursion 
{
	static public String myreverse(String str)
	{
		if(null==str ||str.length()<1)
		{
			return str;
		}
		else
		{
			return myreverse(str.substring(1))+str.charAt(0);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println(myreverse("Hello"));

	}

}
