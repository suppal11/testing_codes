package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamsConcept
{
	public static void main(String[] args) 
	{

		ForkJoinPool corepools=ForkJoinPool.commonPool();
		System.out.println(corepools.getParallelism());

		//1.parallel method of stream

		Stream stream=Stream.of("Hi","Hello","How are","khaana");
		Stream.of("Hi","Hello","How are","khaana").forEach(System.out::println);
		System.out.println("----------------------------");
		Stream.of("Hi","Hello","How are","khaana").parallel().forEach(System.out::println);

		//2.Use parallel stream method on collection stream

		Arrays.asList("Hi","Hello","How are","khaana").parallelStream().forEach(System.out::println);

		//1 to 10

		System.out.println("Sequential Stream");
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println("Parallel Stream");
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);

		//to print a-z 97-122

		System.out.println("Sequential Stream------------");
		getaplha().stream().forEach(System.out::println);
		System.out.println("Parallel Stream--------------");
		getaplha().parallelStream().forEach(System.out::println);

		//check stream is running in parallel mode :isParallel() method
		System.out.println("###############");
		IntStream a=IntStream.rangeClosed(1, 10);
		System.out.println(a.isParallel());
		
		
		System.out.println("###############");
		IntStream a1=IntStream.rangeClosed(1, 10);
		a1.parallel();
		System.out.println(a1.isParallel());

	}
	public static List<String> getaplha()
	{
		List<String> alpha=new ArrayList<String>();

		int n=97;
		while(n<=122)
		{
			char c=(char)n;
			alpha.add(String.valueOf(c));
			n++;	
		}
		return alpha;
	}
}
