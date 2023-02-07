package java_coding;

public class reverse_string 
{
	private static String base_criteria(String st1) 
	{

		if(st1.length()==1)
		{
			return st1;
		}
		else
		{
			return st1.charAt(st1.length()-1)+base_criteria(st1.substring(0,st1.length()-1));
		}
	}


	public static void main(String args[])
	{
		String st1="Hi my name is shivani";
		//	String st2="";
		//	for(int i=st1.length()-1;i>=0;i--)
		//	{
		//		st2=st2+st1.charAt(i);
		//	}
		//	System.out.print(st2);
		//	StringBuffer str1=new StringBuffer(st1);
		//	System.out.print(str1.reverse());
		//System.out.println(base_criteria(st1));
		String rev=base_criteria(st1);
		System.out.print(rev);


		


	}





}
