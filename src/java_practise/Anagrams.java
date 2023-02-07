package java_practise;

import java.util.HashMap;

public class Anagrams 
{

	static boolean Anagram_calc(String str1,String str2)
	{
		String s1_copy=str1.replaceAll("\\s+", "").toLowerCase();
		String s2_copy=str2.replaceAll("\\s+", "").toLowerCase();
		boolean toogle=true;
		if(s1_copy.length()!=s2_copy.length())
			toogle=false;
		else
		{
			HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
			for(int i=0;i<s1_copy.length();i++)
			{
				char char_at=s1_copy.charAt(i);
				int frequency=0;
				if(hm1.containsKey(char_at))
				{
					frequency=hm1.get(char_at);
				}
				hm1.put(char_at, ++frequency);
				char_at=s2_copy.charAt(i);
				frequency=0;
				if(hm1.containsKey(char_at))
				{
					frequency=hm1.get(char_at);
				}
				hm1.put(char_at, --frequency);
				
			}
			for(int s:hm1.values())
			{
				if(s!=0)
				{
					toogle=false;
				}
			}
			
		}
		
		return toogle;

	}

	public static void main(String[] args) 
	{
		String s1="Mother In Law";
		String s2="Hitler Woman";
		System.out.println(Anagram_calc(s1,s2));

	}

}
