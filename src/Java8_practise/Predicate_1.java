/*
 * @FunctionalInterface
public interface Predicate<T>
Represents a predicate (boolean-valued function) of one argument.

This is a functional interface whose functional method is test(Object).


 * 
 * 
 * 
 * 
 * 
 */


package Java8_practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Predicate_1
{

	public static void main(String[] args)
	{
		//Array List
		Predicate<Integer> pred=(x) -> (x>5); 
		List<Integer> list1=Arrays.asList(2,8,9,6,4,6,3,2,1);
		List<Integer> list2=list1.stream().filter(pred).collect(Collectors.toList());
		System.out.println(list2);
		
		//predicate with &&
		List<Integer> list3=list1.stream().filter((x) -> (x>5) && (x<9)).collect(Collectors.toList());
		System.out.println(list3);
		
		//negate
		List<String> list4=Arrays.asList("Naveen","Nav","Ram","Sham");
		Predicate<String> pred2=x->x.startsWith("Naveen"); 
		list4.stream().filter(pred2.negate()).collect(Collectors.toList());
	}

}
