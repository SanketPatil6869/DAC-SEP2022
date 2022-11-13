// Write a Java program to insert an element into the array list at the first position
import java.util.*;
class Collection2
{
	public static void main (String args[])
	{
		List <String> list1 = new ArrayList <String>();
		
		list1.add("Mane");
		list1.add("Sanket");
		list1.add("Shri");
		list1.add("Shubham");
		list1.add("Pratik");
		
		//add element at 1st position
		list1.add(0,"Saurabh");
		
		//iteration using for-each loop
		for (String name : list1)
		{
			System.out.println(name);
		}
	}
}