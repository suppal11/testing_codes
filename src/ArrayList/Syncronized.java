/*to syncronized arraylist
 * 1.Collections.syncrohizedList()-method-return synchronized list
 * 2.copyonwriteArrayList-class-Thread Safe variant of arrayList
 * 
 * 
 * 
 */

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Syncronized
{

	public static void main(String[] args)
	{
		/*add,remove operation we dont need explicit synchronization
		 * to fetch/traverse the values from a list we need to use explicit synchronization
		 * 1.Collections.synchonized
		 * 
		 */


		List<String> list=Collections.synchronizedList(new ArrayList<String>());
		list.add("Java");
		list.add("Python");
		list.add("Ruby");

		synchronized(list)
		{
			Iterator<String> it=list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}

		}


		//2.copyonwrite array class-its thread safe 
		//to fetch/traverse the values from a list we dont need to use explicit synchronization

		CopyOnWriteArrayList<String> cwlist=new CopyOnWriteArrayList<String>();
		cwlist.add("Hi");
		cwlist.add("Hello");
		Iterator<String> it=cwlist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
