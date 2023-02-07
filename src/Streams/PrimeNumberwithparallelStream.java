package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
 * print prime numbers 1 -1000000
 * 
 * 
 */
public class PrimeNumberwithparallelStream {

	public static void main(String[] args) {
		//System.out.println(isPrime(7));
		long t1,t2;
		t1=System.currentTimeMillis();
		long count1=Stream.iterate(0, n->n+1).limit(100000).filter(PrimeNumberwithparallelStream::isPrime).peek(System.out::println).count();
		System.out.println("total prime numbers"+count1);
		t2=System.currentTimeMillis();
		System.out.println("Total time taken"+(t2-t1)/1000);

	}

	public static boolean isPrime(int num)
	{
		if(num<=1)
		return false;
		
		return !IntStream.range(2, num/2).anyMatch(x->num%x==0);
		
	}
	
}
