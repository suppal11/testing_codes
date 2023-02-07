package Java8_practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iterating_Array_List 
{

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("java8");
		list.add("selenium");
		list.add("cucumer");
		list.add("jenkins");
		list.add("testng");

		//1.using java 8 with for each loop and lambda expression

		list.forEach(shows->{
			System.out.println(shows);
		});

		//2.using normal java iterator 

		System.out.println("Normal java");
		Iterator<String> a=list.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());


		}

		//	3.using iterator and for each iterator with lambda

		System.out.println("java 8 with lambda");
		Iterator<String> li=list.iterator();
		li.forEachRemaining(show->{
			System.out.println(show);
		});
		//4.using for each loop
		System.out.println("using for each loop");
		for(String s:list)
		{
			System.out.println(s);
		}
		//5.using for loop with order/index
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("using List iterato that moves forward and backward-::::::::");
       //6.using forward/backward loop
		ListIterator<String> list4=list.listIterator(list.size());
		while(list4.hasPrevious())
		{
			System.out.println(list4.previous());
		}

	}
}