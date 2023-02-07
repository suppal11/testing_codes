package java_coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class find_first_nonrepeating_word 
{
	public static void main(String args[])
	{
		String st2="analogy";
		LinkedHashMap<Character,Integer> hm2=new LinkedHashMap<Character,Integer>();
		char[] str2=st2.toCharArray();
		for(char d:str2)
		{
			if(hm2.containsKey(d))
			{
				hm2.put(d, hm2.get(d)+1);
			}
			else
			{
				hm2.put(d, 1);
			}
		}
		
		for(Entry<Character, Integer> b:hm2.entrySet())
		{
			if(b.getValue()==1)
				System.out.print(b.getKey());
		}

	}
	
}
