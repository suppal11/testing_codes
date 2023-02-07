/*Functional Interface:
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

@FunctionalInterface
public interface Consumer<T>
Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces, Consumer is expected to operate via side-effects.

This is a functional interface whose functional method is accept(Object).


 * 
 * 
 * 
 * 
 * 
 * 
 */


package Java8_practise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface 
{

	public static void main(String[] args) 
	{
		Consumer<String> con=x -> System.out.println(x);
		con.accept("Hi this is consumer");
		
		
		List<Integer> list=Arrays.asList(1,4,5,6,7,8,7,7);
		list.forEach(x -> System.out.println(list.size()));

	}

}
