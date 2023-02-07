package Streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class infinite_Stream {

	public static void main(String[] args) {
		//infiniyt stream is used to generta einfinite stream of data
		//1.iterate()
		//static(T seed,UnaryOperator<T> f)
		//return a stream

		List<Integer> coll=IntStream.iterate(0, n->n+2).mapToObj(Integer::valueOf).limit(10).collect(Collectors.toList());
		System.out.println(coll);


		//2.generate()
		//  static generate (Supplier<T> s)
		//randome Number--100
		List<Integer> a1= Stream.generate(()->(new Random()).nextInt(100)).limit(100).collect(Collectors.toList());
		System.out.println(a1);
	}

}
