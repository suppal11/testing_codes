package Java8_practise;

import java.util.function.Function;

/*Functional interface --@FunctionalInterface this @ is not necessary
 * 
 * it has only 1 abstract method
 * it allows default and static mthods also with method body
 * 
 * 
 * @FunctionalInterface
   public interface Function<T,R>

 * Type Parameters:
T - the type of the input to the function
R - the type of the result of the function
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

 */
public class Functional_Interface 
{
	public static void main(String args[])
	{
		Function<String,Integer> func=x -> x.length();
		int len=func.apply("This is java8");
		System.out.println(len);


		//chaining

		Function<Integer,Integer> func2=x ->2 * x;
		int len2=func.andThen(func2).apply("This is something new");
		System.out.println(len2);
	}



}
