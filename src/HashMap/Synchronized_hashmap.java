package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Synchronized_hashmap {

	public static void main(String[] args) 
	{
		Map<String ,String> hm=new HashMap<String,String>();
		hm.put("1", "One");
		hm.put("2", "Two");
		//create synchronized hash map
		
		Map<String, String> syncronized_map=Collections.synchronizedMap(hm);
		
		//create cocurrent hsh map
		//it does not throw any concurrent modificaton exception
		
		ConcurrentHashMap<String,String> HashMap=new ConcurrentHashMap<String,String>();
		HashMap.put("1", "One1");
		HashMap.put("2", "Two2");

	}

}
