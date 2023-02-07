import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class arraylist {
   public static void main(String[] args) {
      ArrayList<Object> a3=new ArrayList<Object>();
     
      
//      for(int i=0;i<a1.size();i++)
//      {
//    	  System.out.println(a1.get(i));
//      }
      
//      for(Object a2:a1)
//      {
//    	  System.out.println(a2);
//      }
//      
//      Iterator<Object> r1=a1.iterator();
//      while(r1.hasNext())
//      {
//    	  System.out.println(r1.next());
//      }
//      ArrayList<Object> a2=new ArrayList<Object>(Arrays.asList(7,8,9));
//     a1.addAll(a2);
//     System.out.print(a1);
//     
     CopyOnWriteArrayList<String> a1=new CopyOnWriteArrayList<String>();
     a1.add("1");
     a1.add("Hi");
     a1.add("2");
     a1.add("Hello");
     
   Iterator<String>  i=a1.iterator();
   while(i.hasNext())
   {
	   System.out.println(i.next());
   }
      
   }
}