package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Simple_ArrayList {

	public static void main(String[] args) 
	{
		// default class and dynamic array
		//fixes issue of static array
		//ArrayIndexOutofBounds Exception
		//no negative indexing
		//array index out of bounds exception in case there is no index visible
		//virtual capacity at creation is 10 and Physical capacity is 0 ---ar.size
		//to increase virtual capacity 
		
		//Default Generics
		ArrayList arr=new ArrayList();
		arr.add("Hi");
		arr.add(1);
		System.out.println(arr);
		
		ArrayList<Object> arr1=new ArrayList<Object>();
		arr1.add("Hello");
		arr1.add("Hi");
		arr1.add("Bye");
		arr1.add(1);
		
		System.out.println(arr1.get(0));
		
		//increasing the size now
		arr1.size();
		
		
		arr1.add("Bellow");
		
		//way to inc virtual capacity
		ArrayList<Object> arr2=new ArrayList<Object>(20);
		
		//generic type of arraylist works with wrapper classes only and not with primitive data types
		
		ArrayList<String> arr3=new ArrayList<String>(20);
		arr3.add("Value1");
		arr3.add("Value2");
		arr3.add("Value3");
		arr3.add("Value4");
		arr3.add("Value5");
		
		System.out.println("--------");
		
		//Iteration ways
		for(int i=0;i<arr3.size();i++)
		{
			System.out.println(arr3.get(i));
		}
		
		
        System.out.println("--------");
		
		//Iteration ways
		for(String s:arr3)
		{
			System.out.println(s);
		}
		
System.out.println("--------");
		
		//Iterator
		Iterator<String> iter=arr3.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		//Give input of array as input to arraylist
		
		ArrayList<String> arr4=new ArrayList<String>(Arrays.asList("Bye","Bellow"));
		System.out.println("Arr4"+arr4);
		
		//1.AddAll method-:to combine 2 arraylist and at a specific index
		
		ArrayList<String> arr_1=new ArrayList<String>(20);
		arr_1.add("java");
		arr_1.add("python");
		arr_1.add("ruby");
		
		
		ArrayList<String> arr_2=new ArrayList<String>(20);
		arr_2.add("csharp");
		arr_2.add("servicenow");
		
		arr_1.addAll(1, arr_2);
		System.out.println("Add All"+arr_1);
		
		//2.clear All-to empty an arraylist
		
		arr1.clear();
		System.out.println(arr1);
		
		//3.Clone An arrayList
		
		ArrayList<String> clone=(ArrayList<String>) arr_1.clone();
		System.out.println("CloneList"+clone);
		
		//4.contains--returns true or false
		
		System.out.println("contains"+arr_1.contains("java"));
		
		//5.IndexOf--index of 
		
		System.out.println("index"+arr_1.indexOf("java"));
		
		//6.LastIndexof--if element is not present it gives -1
		
		ArrayList<String> arr_3=new ArrayList<String>(Arrays.asList("Hi","Hello","Hi","bye"));
		System.out.println(arr_3.lastIndexOf("Hi"));
		
		//7.Remove Method/RemoveIf(Java 8)
		
		
		arr_3.remove("Hi");
		System.out.println("Removal"+arr_3);
		
		
		//8.RetainAll
		
		arr_3.retainAll(Collections.singleton("Hi"));
		System.out.println(arr_3);
		
		//9.Sublist from a main arrayList
		
		ArrayList<String> arr01=new ArrayList<String>(Arrays.asList("Hi","Hello","Hi","Hello"));
		List<String> result= arr01.subList(0, 1);
		System.out.println(result);
		
		//10.ArrayList to array
		
		ArrayList<String> arr02=new ArrayList<String>(Arrays.asList("Hi","Hello","Hi","Hello"));
		Object[] res=arr02.toArray();
		for(Object s:res)
		{
			System.out.println(s);
		}
		System.out.println(Arrays.toString(res));
		
				
		//Remove duplicate elements
		
		ArrayList<String> arr03=new ArrayList<String>(Arrays.asList("Hi","Hello","Hi","Hello"));
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>(arr03);
		ArrayList<String> al=new ArrayList<String>(lhs);
		System.out.println(al);
		
		//compare 2 arraylist
		
		//sort and then use equals
		
		ArrayList<String> arr_001=new ArrayList<String>(Arrays.asList("Hi","Hello","Bye","Bellow"));
		ArrayList<String> arr_002=new ArrayList<String>(Arrays.asList("Hello","Hi","Bye","Bellow"));
		
		Collections.sort(arr_001);
		Collections.sort(arr_002);
		
		System.out.println(arr_001.equals(arr_002));
		
		
		//retainAll--common of both lists
		//removeAll--unique element of 1st list not in second
		
		
		ArrayList<String> arr_003=new ArrayList<String>(Arrays.asList("Hello","Hi","Bye","Byee"));
		
		arr_003.removeAll(arr_001);
		
		System.out.println(arr_003);
		
		
		ArrayList<String> arr_004=new ArrayList<String>(Arrays.asList("Hello","Hi","Bye","Byee"));
		
		arr_004.retainAll(arr_001);
		System.out.println(arr_004);
		
		
		//ArrayList is not threadSafe
		
		//1.Collections.synchroinizedList
		
		List<String> lang=Collections.synchronizedList(new ArrayList<String>());
		
		//addition,deletion doesn't need synchronization but fecthing values need it
		lang.add("Java");
		lang.add("Rby");
		lang.add("Pyht");
		
		synchronized(lang)
		{
			Iterator<String> iter1=lang.iterator();
			while(iter1.hasNext())
			{
				System.out.println(iter1.next());
			}
			
		}
		
		//2.CopyOnwriteArrayList its a threadsafe class/synchorized already ,we dont need to explicitly put synchronization in add/fecth/delete operations
		
		CopyOnWriteArrayList<String> cw=new CopyOnWriteArrayList<String>(Arrays.asList("Hi","Hello"));
		Iterator<String> iter2=cw.iterator();
		while(iter2.hasNext())
		{
			System.out.println(iter2.next());
		}
		
		
		
		
		

	}

}
