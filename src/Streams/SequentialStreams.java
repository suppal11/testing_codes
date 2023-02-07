package Streams;
/*
 * 
 * 
 * 
 * public interface IntStream
extends BaseStream<Integer,IntStream>
A sequence of primitive int-valued elements supporting sequential and parallel aggregate operations. This is the int primitive specialization of Stream.

The following example illustrates an aggregate operation using Stream and IntStream, computing the sum of the weights of the red widgets:

int sum = widgets.stream()
                      .filter(w -> w.getColor() == RED)
                      .mapToInt(w -> w.getWeight())
                      .sum();See the class documentation for Stream and the package documentation for java.util.stream for additional specification of streams, stream operations, stream pipelines, and parallelism.

 * 
 * 
 * 
 */
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams
{

	public static void main(String[] args) 
	{
		//simple stream

		Stream<String> a=Stream.of("Naveen","Tom","Lisbon");
		a.forEach(System.out::println);
		//Arrays as list
		Arrays.asList("Naveen","Tome","Lisbon").stream().findFirst().ifPresent(System.out::println);
		//range 1:5--+Integer range++Double Range++
		IntStream.range(1,5).forEach(System.out::println);
		//Average
		Arrays.stream(new int[] {1,2,3,4,5}).map(x->2*x+1).average().ifPresent(System.out::println);
		//5 Max number from String
		Stream.of("a1","a2","a3").map(s->s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
		//6Doubles to String objects
		Stream.of(1.0,2.0,3.0,4.0).mapToInt(Double::intValue).mapToObj(i->i+"a").forEach(System.out::println);
		
		//7.limit
		Stream.iterate(0, n->n+1).limit(10).forEach(System.out::println);
		
		//8.10 odd nos
		
		Stream.iterate(0, n->n+1).filter(x->x%2!=0).limit(10).forEach(System.out::println);

	}

}
