/*
 * 
 * 
 * 
 * 
 * 
 * @FunctionalInterface
public interface UnaryOperator<T>
extends Function<T,T>
Represents an operation on a single operand that produces a result of the same type as its operand. This is a specialization of Function for the case where the operand and result are of the same type.

This is a functional interface whose functional method is Function.apply(Object).


 * 
 * 
 * 
 * 
 */
package Java8_practise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Unary_Operator 
{
	public static void main(String args[])
	{
		UnaryOperator<String> func = x -> x.toUpperCase();
		String result=func.apply("I am learning Java 8");
		System.out.println(result);
		
		
		//Function Interface
		
		Function<String,String> func2= x -> x.toUpperCase();	
		String result2=func2.apply("I am learning Java 8 now with function");
		System.out.println(result2);

		//	Unary operator on arraylist
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("Hi");
		list1.add("Hello");
		list1.add("How are");
		list1.replaceAll(x -> x+" Java " );
		System.out.println(list1);
		
		
		
	}
	
}
