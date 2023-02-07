package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Basic_Operations {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		vec.add("Hi");
		vec.add("Hello");
		vec.add("how");
		System.out.println(vec.size());
		System.out.println(vec.get(1));
		System.out.println(vec.remove(1));
		Vector<String> vec2=new Vector<String>();
		vec2.add("Hi");
		vec2.add("Hello");
		vec.addAll(vec2);
		System.out.println(vec);
		//looping
		
		Iterator<String> f=vec.iterator();
		while(f.hasNext())
		{
			System.out.println(f.next());
		}
		
		for(String e:vec)
		{
			System.out.println(e);
		}
		
		for(int i=0;i<vec.size();i++)
		{
			System.out.println(vec.get(i));
		}

	}

}
