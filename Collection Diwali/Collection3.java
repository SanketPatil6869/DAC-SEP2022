// Write a Java program to retrieve an element (at a specified index) from a given array list
import java.util.*;
class Collection3
{
	public static void main (String args[])
	{
		List <String> list1 = new ArrayList <String>();
		
		list1.add("Mane");
		list1.add("Sanket");
		list1.add("Shri");
		list1.add("Shubham");
		list1.add("Pratik");
		
		//retrive element at 2nd index
		System.out.println(list1.get(2));
		
		
	}
}