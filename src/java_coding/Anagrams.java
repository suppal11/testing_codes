package java_coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Anagrams
{
	public static void main(String args[])
	{
		String st1="java2blog";
		String st2="aj2vabgol";
		HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
		char[] str1=st1.toCharArray();
//		for(int i=0;i<str1.length;i++)
//		{
//			if(hm1.containsKey(str1[i]))
//			{
//				hm1.put(str1[i], hm1.get(str1[i])+1);
//			}
//			else
//			{
//				hm1.put(str1[i], 1);
//			}
//		}
	for(char c:str1)
		{
			if(hm1.containsKey(c))
			{
				hm1.put(c, hm1.get(c)+1);
			}
			else
			{
				hm1.put(c, 1);
			}
		}
		System.out.println(hm1);
		HashMap<Character,Integer> hm2=new HashMap<Character,Integer>();
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
		System.out.println(hm2);
		for(Character a:hm2.keySet())
		{
			System.out.println("keys--"+a+"vales---"+hm2.get(a));
		}
		
		for(Entry<Character, Integer> b:hm2.entrySet())
		{
			System.out.println("keys--"+b.getKey()+"vales---"+b.getValue());
		}

		System.out.println(hm1.equals(hm2));

	}
}