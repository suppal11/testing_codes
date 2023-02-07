package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LL is a default class
 * used as stack,queue,list
 * allows null 
 * dynamic collection
 * insertion and deletion can be easily implemted
 * contains duplicate elements
 * its not thread safe
 * data manipulation is fast
 * 
 * ll constructors
 * LinkedList
 * LinkedList(Collections c)
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class LinkedList_concepts 
{
	public static void main(String[] args)
	{
 
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Tom");
		l1.add("Jerry");
		l1.add("Tom2");
		l1.add("Jerry2");
		System.out.println("the size is \t"+l1.size());
		System.out.println("the fetch operation is \t"+l1.get(1));
		Iterator<String> it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		l1.add(2, "Jerr3");
		System.out.println(l1);
		l1.addFirst("Tom10");
		l1.addLast("jerryn");
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		
		//reverse the list
		
		Iterator<String> descending_iter=l1.descendingIterator();
		while(descending_iter.hasNext())
		{
			System.out.println(descending_iter.next());
		}
		
	}
}
