/*
 * @FunctionalInterface
public interface Supplier<T>
Represents a supplier of results.

There is no requirement that a new or distinct result be returned each time the supplier is invoked.

This is a functional interface whose functional method is get().


 * 
 * 
 * 
 * 
 */
package Java8_practise;

import java.util.function.Supplier;

public class Supplier_interface
{
	public static void main(String args[])
	{
		get_text(()->"Java");
		get_text(()->"Java2");
	}
	
	public static void get_text(Supplier<String> x)
	{
		System.out.println(x.get());
		
	}
}
