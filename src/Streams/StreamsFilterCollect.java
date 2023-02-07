package Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args)
	{
		List<String> list1=new ArrayList<String>();

		list1.add("Java");
		list1.add("Selenium");
		list1.add("cucumber");
		list1.add("HasHmap");

		list1.forEach(x->System.out.println(x));

		//using streams and filter to remove hashmap
		List<String> a=list1.stream().filter(ele->!ele.contains("cucumber")).collect(Collectors.toList());
		a.forEach(x->System.out.println(x));
		a.forEach(System.out::println);


	}

}
