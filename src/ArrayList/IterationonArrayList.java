package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationonArrayList
{
	public static void main(String args[])
	{

		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Ram");
		obj.add("Sham");
		obj.add("Sita");
		obj.add("Gita");
		//for each loop with lambda
		obj.stream().forEach(ele->System.out.println(ele));
		System.out.println("************");
		//using iterator
		Iterator<String> iter=obj.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("************");
		//using for each loop
		for(String e:obj)
		{
			System.out.println(e);
		}
		System.out.println("************");
		//using for loop
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
	}
}
