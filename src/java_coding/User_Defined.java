package java_coding;

class User_Defined_Exception extends Exception 
{
	User_Defined_Exception(String str)
	{
		super(str);
	}
	
}
public class User_Defined
{
	public void main(String args[])
	{
		try
		{
			throw new User_Defined_Exception("hello");
		}
		catch(Exception e)
		{
			System.out.println("in the catch block");
		}
	}
	
}
