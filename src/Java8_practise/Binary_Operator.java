/*
 * 
 * @FunctionalInterface
public interface BinaryOperator<T>
extends BiFunction<T,T,T>
Represents an operation upon two operands of the same type, producing a result of the same type as the operands. This is a specialization of BiFunction for the case where the operands and the result are all of the same type.

This is a functional interface whose functional method is BiFunction.apply(Object, Object).


 * 
 * 
 * 
 * 
 * 
 * 
 */


package Java8_practise;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Binary_Operator
{
	public static void main(String args[])
	{
		BinaryOperator<Integer> func=(x1,x2)->x1+x2;
		int len=func.apply(10, 20);
		System.out.println(len);
		
		//Bifunction
		
		BiFunction<Integer,Integer,Integer> func2=(x1,x2)->x1+x2;
		int len2=func.apply(10, 20);
		System.out.println(len2);
		
		
	}
}
