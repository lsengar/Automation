package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

//Arraylist and linked list are not threrad safe and not synchronized
//Vector : Thread and Synchronized

public class Testing1 {

	public static void main(String[] args) 
	
	{
		
		ArrayList<String> stds = new ArrayList<>();	
		stds.add("Anand");
		stds.add("abc");
		stds.add("xyz");
		
		LinkedList<String> stds1 = new LinkedList<>();	
		stds1.add("Anand");
		stds1.add("abc");
		stds1.add("xyz");
		
		Vector<String> stds2 = new Vector<>();	
		stds2.add("Anand");
		stds2.add("abc");
		stds2.add("xyz");


		for (String s:stds)
		{
			System.out.println(s);
		}
	}

}
