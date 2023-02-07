package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicateelementsremoval {

	public static void main(String[] args) {
		//hashSet
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(1,3,2,1,4,6,5,4,4,3,0));
		HashSet<Integer> hs=new HashSet<Integer>(li);
		List<Integer> li2=new ArrayList<Integer>(hs);
		System.out.println(li2);
		
		//using java 8 stream
		
		List<Integer> a=li.stream().distinct().collect(Collectors.toList());
		System.out.println(a);

	}

}
