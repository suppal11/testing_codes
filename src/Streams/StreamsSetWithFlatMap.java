package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSetWithFlatMap 
{

	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		emp1.setName("Ram");
		emp1.addDevices("Iphones1");
		emp1.addDevices("Samsung");

		Employee emp2=new Employee();
		emp2.setName("Sham");
		emp2.addDevices("Nokia");
		emp2.addDevices("Iphones1");

		List<Employee> l1=new ArrayList<Employee>();
		l1.add(emp2);
		l1.add(emp1);

		Stream<Employee> a1=l1.stream();
		Stream<Object> a2=a1.map(x->x.getDevices()).flatMap(x->x.stream());
		a2.distinct().collect(Collectors.toList()).forEach(x->System.out.println(x));

	}

}
