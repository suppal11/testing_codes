package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class HashMap_to_arraylist 
{

	public static void main(String[] args)
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four", 4);

		Iterator<Entry<String, Integer>> a=hm.entrySet().iterator();
		while(a.hasNext())
		{
			Entry<String, Integer> b=a.next();
			System.out.println(b.getKey()+"-"+b.getValue());
		}

		//using Java 8
		
		hm.forEach((k,v)->System.out.println("key"+k+"value"+v));
		
		//convert hashmap to arraylist

		List<String> keys=new ArrayList<String>(hm.keySet());
		for(String e:keys)
		{
			System.out.println(e);
		}

		//convert hashmap values to arraylist

		List<Integer> values=new ArrayList<Integer>(hm.values());
		for(Integer f:values)
		{
			System.out.println(f);
		}
		
		
		


	}

}
