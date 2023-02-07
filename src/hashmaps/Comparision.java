package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Comparision {

	public static void main(String[] args)
	{
		HashMap<String,String> hm=new  HashMap<String,String>();
		hm.put("One", "1");
		hm.put("Two", "2");
		hm.put("Three", "3");
		hm.put("Four", "4");
		
		HashMap<String,String> hm2=new  HashMap<String,String>();
		
		hm2.put("Two", "2");
		hm2.put("Four", "4");
		hm2.put("One", "1");
		hm2.put("Three", "3");
		
        HashMap<String,String> hm3=new  HashMap<String,String>();
		
		hm3.put("Two", "2");
		hm3.put("Four", "4");
		hm3.put("One", "1");
		
		System.out.println(hm.equals(hm2));
		System.out.println(hm2.equals(hm3));
		
		System.out.println(hm.keySet().equals(hm2.keySet()));
		System.out.println(hm2.keySet().equals(hm3.keySet()));
		
		HashSet<String> hs=new HashSet<String>(hm3.keySet());
		hs.addAll(hm2.keySet());
		hs.removeAll(hm2.keySet());
		
		HashMap<Integer,String> hm4=new  HashMap<Integer,String>();
		hm4.put(1, "1");
		hm4.put(2, "2");
		hm4.put(3, "4");
		hm4.put(4, "4");
		
		HashMap<Integer,String> hm5=new  HashMap<Integer,String>();
		
		hm5.put(2, "2");
		hm5.put(4, "4");
		hm5.put(1, "1");
		hm5.put(3, "3");
		
        HashMap<Integer,String> hm6=new  HashMap<Integer,String>();
		
		hm6.put(2, "2");
		hm6.put(4, "4");
		hm6.put(1, "1");
		
		
		System.out.println(new ArrayList<>(hm4.values()).equals(new ArrayList<>(hm6.values())));
		System.out.println(new ArrayList<>(hm5.values()).equals(new ArrayList<>(hm6.values())));
		
		
		System.out.println(new HashSet<>(hm4.values()).equals(new HashSet<>(hm6.values())));
		System.out.println(new HashSet<>(hm5.values()).equals(new HashSet<>(hm6.values())));
		
		
		
		
		
		
		

	}

}
