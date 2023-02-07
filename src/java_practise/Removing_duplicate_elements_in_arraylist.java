package java_practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Removing_duplicate_elements_in_arraylist 
{
public static void main(String args[])
{
	ArrayList<String>  ar=new ArrayList<String>();
	ar.add("java");
	ar.add("Selenium");
	ar.add("java");
	Set<String> set =new HashSet<String>(ar);
	ArrayList<String>  ar2=new ArrayList<String>(set);
	System.out.print(ar2);
}
}
