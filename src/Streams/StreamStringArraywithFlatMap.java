package Streams;
/*
 * 
 * FlatMap
 */
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStringArraywithFlatMap {

	public static void main(String[] args) {
		String data[][]= {
				{"a","b"},
				{"c","d"},
				{"e","f"}
				};

		
		Stream<String[]> a=Arrays.stream(data);
		Stream<String> b=a.flatMap(x->Arrays.stream(x));
		Stream<String> a1=b.filter(x->"a".equals(x.toString()));
		a1.forEach(System.out::println);
	}

}
