package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamArraywithFlatMap 
{
	public static void main(String args[])
	{

		int[] data= {1,2,3,4,5,6,7,8,9};
		Stream<int[]> a=Stream.of(data);
		IntStream y=a.flatMapToInt(x->Arrays.stream(x));
		y.forEach(System.out::println);
		
	}
}
