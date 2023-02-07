package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OperationsonArrayList {

	public static void main(String[] args) 
	{
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Python");
		arr.add("java");
		arr.add("Selenium");


		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Devops");
		arr2.add("Testing");
		arr2.add("Cloud");

		//ADD all

		arr2.addAll(arr);
		System.out.println(arr2);

		//ADD at specific index

		arr.addAll(2, arr2);
		System.out.println(arr);

		//clear

		arr.clear();
		System.out.println(arr);

		//Clone

		ArrayList<String> arrclone=(ArrayList<String>)arr2.clone();
		System.out.println(arrclone);

		//contains-True/false

		System.out.println(arr2.contains("Python"));

		//index-value greater than 1 if present

		System.out.println(arr2.indexOf("Python")>0);

		//last Index if element is not present it return -1

		System.out.println(arr2.lastIndexOf("Python"));

		//remove using index and object names also

		System.out.println("******");
		System.out.println(arr2);
		System.out.println(arr2.remove(1));
		System.out.println(arr2.remove("Python"));
		System.out.println(arr2);

		//WAP to print only odd nos using remove if
		ArrayList<Integer> arr4=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		arr4.removeIf(ele->ele%2==0);
		System.out.println(arr4);

		//retainAll
		ArrayList<String> arr5=new ArrayList<String>(Arrays.asList("Tom","Harry","Tom"));
		arr5.retainAll(Collections.singleton("Tom"));
		System.out.println("singleton"+arr5);

		//sublist
		ArrayList<Integer> arr6=new ArrayList<Integer>(Arrays.asList(1,2,5,4,5,6,7,8,9,10));
		ArrayList<Integer> sublist=new ArrayList<Integer>(arr6.subList(2, 5));
		System.out.println(sublist);

		//toArray

		ArrayList<String> arr7=new ArrayList<String>(Arrays.asList("Tom","Harry","Tom2","Harry2"));
		Object[] a=arr7.toArray();
		for(Object ab:a)
		{
			System.out.println(ab);
		}
	}

}
