package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_opr {

	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8}));
		
		Set<Integer> set2=new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {6,7,8,9}));
		
		Set<Integer> union=new HashSet<Integer>(set1);
	    union.addAll(set2);
		System.out.println(union);
		
		Set<Integer> intersection=new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
	}

}
