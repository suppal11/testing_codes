package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsFilterFindAny 
{

	public static void main(String[] args) 
	{
		//Example of filter with find any terminal
		List<Customer> list=Arrays.asList(
				new Customer(30,"Tom"),
				new Customer(40,"Ram"),
				new Customer(50,"Sham"),
				new Customer(60,"Harry"),
				new Customer(10,"Tim")
				) ;


		Customer a=list.stream().filter(x->"Tom".equals(x.getName())).findAny().orElse(null);
		System.out.println(a.getAge()+"\t"+a.getName());
		//Filter with multiple conditions

		Customer b=list.stream().filter(x->"Tom".equals(x.getName()) && 30==x.getAge()).findAny().orElse(null);
		System.out.println(b.getAge()+"\t"+b.getName());

		//filter map

		String c=list.stream().filter(x->"Tom".equals(x.getName())).map(Customer::getName).findAny().orElse(null);
		System.out.println(c);

		//print all list names

		List<String> b1=list.stream().map(Customer::getName).collect(Collectors.toList());
		b1.forEach(x->System.out.println(x));

	}

}
