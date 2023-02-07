package programsCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylist 
{

	public static void main(String[] args) {
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add("Hi");
		ar.add("1");
		ar.add("2");
		ar.add("3");
		ar.add("4");
		ar.add("5");
		
		ArrayList<Object> ar2=new ArrayList<Object>();
		ar2.add("5");
		ar2.add("7");
		ar2.add("8");
		ar2.add("9");
		ar2.add("10");
		ar2.add("11");
		
		ar.addAll(2,ar2);
		System.out.println(ar);
		System.out.println(ar.contains("5"));
		System.out.println(ar.indexOf("5"));
		System.out.println(ar.lastIndexOf("5"));
		ar.remove(0);
		System.out.println(ar);
		
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		al.removeIf(num->num%2==0);
		System.out.println(al);
		
		ArrayList<Integer> sb=new ArrayList<Integer>(Arrays.asList(11,21,31,41,51,61,71,81,91,101));
		sb.subList(0, 4);
		System.out.println(sb.subList(0, 4));
		
		Object[] a=sb.toArray();
		for(Object a1:a)
		{
			System.out.println(a1);
		}
		System.out.println("Copy on write arraylist");
		
		CopyOnWriteArrayList<String> it =new CopyOnWriteArrayList<String>();
		it.add("Hi");
		it.add("Hello");
		it.add("How are");
		
		Iterator<String> i=it.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("Helllllllllllloooooo");
		
		List<String> coll=Collections.synchronizedList(new ArrayList<String>());
		coll.add("Hi");
		coll.add("Hello");
		coll.add("How are you");
		
		synchronized(coll)
		{
			
			Iterator<String> iter=coll.iterator();
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
			
			
		}
		
		ArrayList<Integer> ig=new ArrayList<>(Arrays.asList(1,2,2,2,2,2,3,3,3,3,4,4,4));
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>(ig);
		ArrayList<Integer> ig2=new ArrayList<>(lhs);
		System.out.println(ig2);
		
		
		ArrayList<String> al1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> al2=new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		ArrayList<String> al3=new ArrayList<String>(Arrays.asList("F","A","C","D","E"));
		ArrayList<String> al4=new ArrayList<String>(Arrays.asList("F","A","C","D","S"));
		Collections.sort(al1);
		Collections.sort(al2);
		System.out.println(al1.equals(al2));
		System.out.println(al2.removeAll(al1));
		System.out.println(al2);
		al3.retainAll(al4);
		System.out.println(al3);
		
		
		
		
		
		
		

		//for(int i=0;i<ar.size();i++)
		//{
			//System.out.println(ar.get(i));
		//}
		
//       for(Object o:ar)
//       {
//    	 System.out.println(o);  
//       }
		
//		Iterator<Object> s=ar.iterator();
//		while(s.hasNext())
//		{
//			System.out.println(s.next());
//		}
		//ar.add(ar2);
		//System.out.println(ar);
//		ar.add(3, ar2);
//		System.out.println(ar);
//		Object o=ar.clone();
//		System.out.println(o);
		
	}

}
