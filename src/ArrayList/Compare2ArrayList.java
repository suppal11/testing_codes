package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Compare2ArrayList {

	public static void main(String[] args) {
		//1.sort and then equals

		List<String> li=new ArrayList<String>(Arrays.asList("A","C","G","B"));
		List<String> li2=new ArrayList<String>(Arrays.asList("B","C","G","B"));
		List<String> li3=new ArrayList<String>(Arrays.asList("B","B","G","C"));
		Collections.sort(li);
		Collections.sort(li2);
		Collections.sort(li3);
		System.out.println(li.equals(li2));//false
		System.out.println(li2.equals(li3));

		//2.compare 2 arraylist and find out additional elements

		List<String> li4=new ArrayList<String>(Arrays.asList("A","C","G","B"));
		List<String> li5=new ArrayList<String>(Arrays.asList("B","C","G","F"));
		li4.removeAll(li5);
		System.out.println(li4);//A

		//3.find out missing element
		li5.removeAll(li4);
		System.out.println(li5);//F if line 26 and 27 r commented

		//4.find out the common elements

		List<String> li7=new ArrayList<String>(Arrays.asList("A","C","G","B"));
		List<String> li8=new ArrayList<String>(Arrays.asList("B","C","G","F"));
		li7.retainAll(li8);
		System.out.println(li7);


	}

}
