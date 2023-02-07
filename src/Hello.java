import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hello {
   public static void main(String[] args) {
      HashMap<String,String> hm=new HashMap<String,String>();
      hm.put("1", "one");
      hm.put("2", "Two");
      hm.put("3", "Three");
    	  
      HashMap<String,String> hm2=new HashMap<String,String>();
      hm2.put("1", "one");
      hm2.put("2", "Two");
      hm2.put("3", "Two");
      hm2.put("3", "Four");
      
      HashMap<String,String> hm3=new HashMap<String,String>();
      hm3.put("1", "one");
      hm3.put("3", "Three");
      hm3.put("2", "Two");
      hm3.put("4", "Two");
      
//      HashSet<String> h1=new HashSet<String>(hm.keySet());
//      h1.addAll(hm3.keySet());
//    	  
//      h1.removeAll(hm.keySet());
//      System.out.println(h1);
//      
//      System.out.println(new ArrayList<>(hm3.values()).equals(new ArrayList<>(hm2.values())));
      
      
   }
}