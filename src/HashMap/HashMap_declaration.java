package HashMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMap_declaration
{
	
	public static Map<String,Integer> marksup;
	
	static
	{
		marksup=new HashMap<>();
		marksup.put("A", 100);
		marksup.put("B", 200);
	}

	public static void main(String[] args) 
	{
		//1.using hashMap Class
		
		HashMap<String,String> hm=new HashMap<>();
		Map<String,String> hm2=new HashMap<>();
		
		//2.static hashmap:static way 
		System.out.println(HashMap_declaration.marksup.get("A"));
		
		//3 immutable map using single entry
		Map<String, Integer> a=Collections.singletonMap("test", 1);
		System.out.println(a.get("test"));
		
		//a.put("test1", 2);//unsuported operation exception
		
		//4.JDK 1.8 method
		//creating 2 D array of maps and creating streams on the basis of it
		
		Map<String,String> hm4=Stream.of(new String[][] {
			
			{"Tome","A Grade"},
			{"Tom1","B Grade"}
			
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		System.out.println(hm4.get("Tom1"));
		hm4.put("Tom3", "A++ Grade");
		System.out.println(hm4.get("Tom3"));
		
		//using SimpleEntry:
		
	Map<String, String> hm5=
		Stream.of(new AbstractMap.SimpleEntry<>("Naveen","pooja"),
				  new AbstractMap.SimpleEntry<>("Naveen1","Pojja1")
				 ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	
	System.out.println(hm5.get("Naveen"));
	hm5.put("Naveen1", "Pojja3");
	System.out.println(hm4.get("Naveen1"));
	
	
	//JDK 1.9 empty map
	
	Map<Object, Object> emptymap=Map.of();
	
	//emptymap.put("Tom123", "Tom123");
	//unsupported opertion exception//System.out.println(emptymap.get("Tom123"));
	
	//singleton map
	
	Map<String, String> hm6=Map.of("k1", "V1");
	//unsupported opertion exception//System.out.println(hm6.get("k1"));
	
	
	//multi Values Map
	Map<String, String> h7=Map.of("Tom","key","tom2","key2");
	System.out.println(h7.get("Tom"));
	
	//imutable mps here no chnges can be made to entries
	Map<String, Integer> h8=Map.ofEntries(new AbstractMap.SimpleEntry<>("A",100),
			      new AbstractMap.SimpleEntry<>("B",20));
	
	System.out.println(h8.get("A"));
	
	
	//imutble maps using Guava
	


	}

}
