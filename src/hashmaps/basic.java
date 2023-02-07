package hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class basic {

	public static void main(String[] args) {
		HashMap<String,String> hm=new  HashMap<String,String>();
		hm.put("One", "1");
		hm.put("Two", "2");
		hm.put("Three", "3");
		hm.put("Four", "4");
		
		
		
		
		
		Iterator<String> keysiter=hm.keySet().iterator();
		while(keysiter.hasNext())
		{
				String keys=keysiter.next();
				String value=hm.get(keys);
				System.out.println(keys+"-"+value);
		}
		
		Iterator<Entry<String, String>> entry=hm.entrySet().iterator();
		while(entry.hasNext())
		{
			String keys1=entry.next().getKey();
			//String values1=entry.next().getValue();
			System.out.println(keys1+"-"+hm.get(keys1));
			
			
		}

	}

}
