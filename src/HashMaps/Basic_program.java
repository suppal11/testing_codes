package HashMaps;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Basic_program 
{
	
	public static Map<String,Integer> hm;
	
	static
	{
		hm=new HashMap<String,Integer>();
		hm.put("abc", 1);
		hm.put("def", 2);
	}

	public static void main(String[] args) {
		
    //no order--no indexing
		//stores in form of key /values
		//key can not be duplicate values can be duplicate
		//we can have many null values but single null key
		//it is not thread safe
		
		
		
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("UK", "London");
		hm1.put("US", "Amsterdam");
		hm1.put("ABC", "Yo");
		hm1.put("ABC", "Yo-Yo");
		String keys;
		
		System.out.println(hm1.get("UK"));
		
		//Iteration
		Iterator<String> iter=hm1.keySet().iterator();
		while(iter.hasNext())
		{
			keys=iter.next();
			System.out.println("Keys"+keys);
			System.out.println("Values"+hm1.get(keys));
		}
		
		
		//iteration
		Iterator<Entry<String, String>> iter2=hm1.entrySet().iterator();
		while(iter2.hasNext())
		{
			Entry<String, String> k1=iter2.next();
			System.out.println("Keys"+k1.getKey());
			System.out.println("Values"+k1.getValue());
		}
		
		//remove
		hm1.remove("UK");
		
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		hm2.put(1, "A");
		hm2.put(2, "B");
		hm2.put(3, "C");
		
		HashMap<Integer,String> hm3=new HashMap<Integer,String>();
		hm3.put(1, "A");
		hm3.put(3, "C");
		hm3.put(2, "B");
		
		HashMap<Integer,String> hm4=new HashMap<Integer,String>();
		hm4.put(1, "A");
		hm4.put(2, "B");
		hm4.put(3, "C");
		hm4.put(4, "D");
		
		//1.Compare on key value pairs using equals method
		
		System.out.println("Compare on key value pairs using equals method"+hm2.equals(hm3));//true
		System.out.println("Compare on key value pairs using equals method"+hm2.equals(hm4));//false
		
		//2.compare hashmaps for same keys using keyset
		
		System.out.println("compare hashmaps for same keys using keyset"+hm2.keySet().equals(hm3.keySet()));//true
		System.out.println("compare hashmaps for same keys using keyset"+hm2.keySet().equals(hm4.keySet()));//false
		
		//3.find out the extra keys
		
		HashSet<Integer> hs=new HashSet<Integer>(hm3.keySet());
		hs.addAll(hm4.keySet());
		hs.removeAll(hm3.keySet());
		System.out.println("Extra keys"+hs);
		
		
		//4.Compare by values
		
		HashMap<Integer,String> hm5=new HashMap<Integer,String>();
		hm5.put(1, "A");
		hm5.put(2, "B");
		hm5.put(3, "C");
		
		HashMap<Integer,String> hm6=new HashMap<Integer,String>();
		hm6.put(1, "A");
		hm6.put(3, "C");
		hm6.put(2, "B");
		
		HashMap<Integer,String> hm7=new HashMap<Integer,String>();
		hm7.put(1, "A");
		hm7.put(2, "B");
		hm7.put(3, "C");
		hm7.put(3, "D");
		
		//1.Duplicates are not allowed
		
		
		
		System.out.println(new ArrayList<String>(hm5.values()).equals(new ArrayList<String>(hm7.values())));
		
		//2.duplicates are allowed
		
		System.out.println(new HashSet<String>(hm5.values()).equals(new HashSet<String>(hm7.values())));
		
		//creating hashmap using static block
		
		Map<String,Integer> hashmap_static ;
		
		//immutable hash map with one entry only
		// java.lang.UnsupportedOperationException
		Map<Integer,String> hm8=Collections.singletonMap(1, "key1");
		System.out.println(hm8.get(1));
		//hm8.put(2, "abc");
		
		//JDK 9
		//empty map
		//java.lang.UnsupportedOperationException
		Map<String,Integer> hm10=Map.of();
		
	
//		hm10.put("abc", 1);
//		System.out.println(hm10.get("abc"));
		
		//singleton map
		Map<String, String> hm11= Map.of("k1","v1");
		System.out.println(hm11.get("k1"));
		
		//multimap with 10 max values map
				Map<String, String> hm12= Map.of("k1","v1","k2","v2");
				System.out.println(hm12.get("k1"));
				
				
				//imutable map with ofEntires method,no limitiatation on key size
				
				Map<String,Integer> hm13=	Map.ofEntries(new AbstractMap.SimpleEntry<>("A", 1),
						new AbstractMap.SimpleEntry<>("B", 2));
				System.out.println(hm13.get("A"));
				
				//SynchroziedMap
				
				HashMap<String,Integer> hm_1=new HashMap<String,Integer>();
				hm_1.put("1", 1);
				hm_1.put("2", 2);
				Map<String, Integer> a=Collections.synchronizedMap(hm_1);
				
				System.out.println("Synchronized version"+a);
				
				//Concurrent Hash map
				
				ConcurrentHashMap<String,String> hm_2=new ConcurrentHashMap<>();
				hm_2.put("1", "1");
				hm_2.put("2", "2");
				
				System.out.println("Concurrent"+hm_2);
				
				
				//Convert hashmap to arraylist
			
				//entry set
				HashMap<String,String> hm_ar=new HashMap<String,String>();
				
				hm_ar.put("abc", "abc1");
				hm_ar.put("def", "def1");
				hm_ar.put("ghi", "ghi1");
				
				Iterator<Entry<String, String>> itr=hm_ar.entrySet().iterator();
				String key;
				
				while(itr.hasNext())
					
				{
					key=itr.next().getKey();
					System.out.println("Key "+key+" value "+hm_ar.get(key));
				}
				
				//convert hashmap to arraylist
				
				List<String> keys_gp=new ArrayList<String>(hm_ar.keySet());
				System.out.println(keys_gp);
				
				List<String> values_gp=new ArrayList<String>(hm_ar.values());
				System.out.println(values_gp);
				
				TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
				tm.put("abc",1);
				tm.put("def",2);
				tm.put("ghi",3);
				System.out.println(tm.firstKey());
				System.out.println(tm.lastKey());
				
				Set<String> keys_tm=tm.headMap("def").keySet();
				System.out.println(keys_tm);
				
				
				
		
		
		
			
		
		
		

	}

}
