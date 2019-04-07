package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	
	//HashSet        LinkedHashSet          TreeSet
//	Random									Sorted
	public static void main(String[] args) 
	
	{
		HashSet<String> set = new HashSet<>();
		set.add("Priyanka");
		set.add("Priyanka");
		set.add("Nilima");
		set.add("Lokesh");
		set.add("abc");
		for (String s:set)
		{
			System.out.println(s);
		}
		
		
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("Priyanka");
		set2.add("Priyanka");
		set2.add("Nilima");
		set2.add("Lokesh");
		set2.add("abc");
		for (String s:set2)
		{
			System.out.println(s);
		}
		
		TreeSet<String> set3 = new TreeSet<>();
		set3.add("Priyanka");
		set3.add("Priyanka");
		set3.add("Nilima");
		set3.add("Lokesh");
		set3.add("abc");
		for (String s:set3)
		{
			System.out.println(s);
		}
	}

}
