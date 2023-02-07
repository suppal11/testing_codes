package java_coding;

import java.util.HashSet;

public class String_has_unique_characters
{
public static void main(String args[])
{
	String s="STRINGOWJDOJS";
	
	HashSet<String> hs=new HashSet<String>();
	char c[]=s.toCharArray();
	for(char a:c)
	{
		if(hs.add(String.valueOf(a)))
		{
			System.out.println("added----"+a);
		}
		
	}
	for(int i=0;i<s.length();i++)
	{
		char word=s.charAt(i);
		if(s.indexOf(word)!=s.lastIndexOf(word))
		{
			
		}
	}
	
}
}
