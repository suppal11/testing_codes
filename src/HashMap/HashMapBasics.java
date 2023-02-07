package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		//no ordering+no indexing
		//everything stored int he form of key value pair-(K,V)
		//keys cant be duplicate
		//can store n number of null values but can store only 1 null key
		//if same key points to 2 different values then the last value for that key is retained

		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("India","Delhi");
		hm.put("USA","WashingtonDC");
		hm.put("India","Punjab");
		hm.put(null,"ABC");
		hm.put(null,"DEF");
		hm.remove(null);

		//no error is thrown if same key points to 2 different values then the last value for that key is retained
		System.out.println(hm.get("India"));

		//can store n number of null values but can store only 1 null key
		System.out.println(hm.get(null));//DEF

		//to iterate over key set

		Iterator<String> a=hm.keySet().iterator();
		while(a.hasNext())
		{
			String key=a.next();
			String valueString=hm.get(a);
			System.out.println(key+"-key value"+"\nValue String is-"+valueString);
		}

		//to iterate over the set (pairs) using entrySet
		Iterator<Entry<String, String>> b=hm.entrySet().iterator();

		while(b.hasNext())
		{
			Entry<String, String> c=b.next();
			//System.out.println(c);
			System.out.println("key value"+c.getKey());
			System.out.println("value"+c.getValue());
		}

		//iteration using java 8 
		hm.forEach((k,v)->System.out.println("key  "+k+"value  "+v));


	}

}
