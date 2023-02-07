package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListVirtualCapacity {

	public static void main(String[] args) {
		// default class dynamic array
		
		//static array would be int arr=new arr[2];
		//the moment we use arr[3]=0 or arr[-1]=0
		//we will get index array out of bounds exception
		
		//default generics
		
		//Default virtual capacity is 10 as we go on increasing the elements in
		//the list the physical capacity increases and virtual capacity decreases
		
		
		ArrayList<Object> obj=new ArrayList<Object>();
		System.out.println(obj);
		obj.add("1");
		obj.add("Hi");
		obj.add("Retro");
		System.out.println(obj);
		
		/*To increases virtual capacity
		 * 
		 * 
		 */
		ArrayList<Object> obj1=new ArrayList<Object>(20);
		
		/***
		 * Generic means data of particular type lets say Integer wrapper can be stored 
		 * when declared in the way
		 * 
		 * ArrayList<Integer> arr=new ArrayList<Integer>();
		 *simarly Double is allowed ,String is allowed
		 * 
		 */
		
		/*
		 * 
		 * list with other collections as input
		 * 
		 * 
		 * 
		 */
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(10,20,30));
		System.out.println(arr);
		
		

	}

}
