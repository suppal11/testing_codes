package java_practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Duplicate_character_in_string
{

	public static void main(String[] args) 
	{
		String s="this is my string test";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		char[] s1=s.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
			if(hm.containsKey(s1[i]))
				hm.put(s1[i],hm.get(s1[i])+1 );

			else
				hm.put(s1[i], 1);

		}
		Set<Character> keys=hm.keySet();
		//	System.out.println(keys);
		for(Character key:keys)
		{
			if((hm.get(key)>1))
				System.out.println(key);
		}	


	}

}	