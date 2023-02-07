package java_practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_Elements_in_array
{

	public static void main(String[] args)
	{

		String names[]= {"Java","C","Java","N","D","E"};
		//1.Compare each element :O(n*n)--worst solution

		for (int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate elemets found at"+names[i]);
				}
			}
		}

		//2.using HashSet:java collection it stores unique values
		//O(n) complexity
		Set<String> set=new HashSet<String>();
		for(String s:names)
		{
			if(set.add(s)==false)
			{
				System.out.println("Duplicate element was "+s);
			}
		}

		//3.Using HashMap:O(2n)

		Map<String,Integer> hm=new HashMap<String,Integer>();
		for(String str:names)
		{
			Integer count=hm.get(str);
			if(count==null)
			{
				hm.put(str, 1);
			}
			else
			{
				hm.put(str, ++count);
			}
		}
		Set<Entry<String, Integer>> a1=hm.entrySet();
		for(Entry<String, Integer> eset:a1)
		{
			if(eset.getValue()>1)
			{
				System.out.println("Found Duplicate elements"+eset.getKey());
			}
		}

	}

}
