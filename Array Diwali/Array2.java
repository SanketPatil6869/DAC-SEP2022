//Write a Java program to check the equality of two arrays?
import java.util.*;
class Array2
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		System.out.println("Enter the element of first array");
		for (int i=0; i<size; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element of second array");
		for (int i=0; i<size; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		boolean result = Arrays.equals(arr1, arr2);
		
		if (result == true)
		{
			System.out.println("Two Arrays are equals");
		}
		if (result == false)
		{
			System.out.println("Two Arrays are Unequals");
		}
		
		
	}
}