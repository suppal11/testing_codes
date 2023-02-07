package java_practise;

public class Remove_Junk_characters 
{
public static void main(String args[])
{
	String s="@#$% latin string 02389249379823aaaaa990";
	//use regular expressions to remove special characters
	
	//regex to keep only number and alphabet
	//[^a-zA-Z0-9]

	s=s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
	
	//to keep only numbers
	System.out.println(s.replaceAll("[^0-9]", ""));
}
}
