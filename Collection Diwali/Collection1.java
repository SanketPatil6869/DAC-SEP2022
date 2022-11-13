// Write a Java program to create a new array list, add some colors (string) and print out the collection.
import java.util.*;
class Collection1
{
	public static void main (String args[])
	{
		List <String> col1 = new ArrayList <String>();
		
		col1.add("Orange");
		col1.add("Blue");
		col1.add("Red");
		col1.add("White");
		col1.add("Green");
		
		for (String color : col1)
		{
			System.out.println(color);
		}
	}
}