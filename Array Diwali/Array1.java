//Write a program to print elements of Array ?

import java.util.*;
class Array1
{
	public static void main (String args[])
	{
		int arr[] = {15,20,5,10,25};
		
		//using for loop
		System.out.println("Using for loop");
		for (int i=0; i<arr.length; i++)
		{			
			System.out.println(arr[i]);
		}
		
		System.out.println("Using for-each loop");
		for (int X : arr)
		{
			System.out.println(X);
		}
		
		System.out.println("Using toString method");
		String s = Arrays.toString(arr);
		System.out.println(s);
	}
}
