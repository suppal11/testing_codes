package java_practise;

public class Reverse_of_String 
{

	public static void main(String args[]) 
	{
		// 1.reverse metho is not present in string since they r immutable nut in
		// 2.stringbuffer its there since they r mutable

		String s = "My Name";
		String rev="";
		for (int i = s.length()-1; i >= 0; i--) 
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		StringBuffer str = new StringBuffer(s);
		System.out.println(str.reverse());
		
		
	}

}
