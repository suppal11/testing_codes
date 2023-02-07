package HashMap;

import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(100, "Hi");
		tm.put(120, "Hello");
		tm.put(10, "How are");
		System.out.println(tm);
		tm.forEach((k,v)->System.out.println("key"+k+"value"+v));

		
		//to get lowest and highest key
	    System.out.println(tm.firstKey()+"\t"+"first key");
	    System.out.println(tm.lastKey()+"\t"+"last key");
		
	    //to print according to range to values
	    Set<Integer> a=tm.headMap(90).keySet();
	    System.out.println(a);
	    
	    Set<Integer> b=tm.tailMap(120).keySet();
	    System.out.println(b);
	    
	   //sorting on basis of alphabetical order 
	    TreeMap<String,Integer> tm2=new TreeMap<String,Integer>();
		tm2.put("James", 100);
		tm2.put("Brad",20);
		tm2.put("Albert",30);
		tm2.put("George",30);
		tm2.put("Larry",30);
		tm2.put("ted",30);
		tm2.put("Paul",50);
		System.out.println(tm2);
		
		TreeMap<String,Integer> tm3=new TreeMap<String,Integer>(Collections.reverseOrder());
		tm3.put("James", 100);
		tm3.put("Brad",20);
		tm3.put("Albert",30);
		tm3.put("George",30);
		tm3.put("Larry",30);
		tm3.put("ted",30);
		tm3.put("Paul",50);
		System.out.println(tm3);
		
	    
	}
 
}
