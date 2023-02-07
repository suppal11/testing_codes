package Java8_practise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda_topic 
{
	public static void main(String args[])
	{
		System.out.println("Anonymous inner class------------");

		List<String> li=Arrays.asList("Hi","Hello","How are");
		//1.ananoymous inner class
		li.forEach(new Consumer<String>()   //anonymous inner class
				{

			@Override
			public void accept(String t) 
			{
				System.out.println(t);

			}

				});
		//2.lambda
		System.out.println("lambda------------");

		li.forEach(x->System.out.println(x));

		//3.method references
		System.out.println("method refernces-----------");

		li.forEach(System.out::println);

		//4.for each references
		System.out.println("for each refernces-----------");

		for(String li2:li)
		{
			System.out.println(li2);
		}
		//5.for loop
		System.out.println("for loop----------");

		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
	}
}
