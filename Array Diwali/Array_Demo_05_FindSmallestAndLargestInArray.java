
import java.util.*;

class SmallestLargest
{

	static void inputArray(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the Array Elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	static void methodSmallestLargest(int arr[])
	{
		int small = arr[0];
		int large = arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]>large)
			{
				large = arr[i];
			}
			
			if(arr[i]<small)
			{
				small = arr[i];
			}	
		}
		System.out.println("The Smallest no from the array is : "+small);
		System.out.println("The Largest no from the array is : "+large);
	}
}

class Array_Demo_05_FindSmallestAndLargestInArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		SmallestLargest.inputArray(arr);
		SmallestLargest.methodSmallestLargest(arr);
	}
}

/*
OUTPUT - 

Enter the size of array : 5

Enter the Array Elements
33
66
88
22
44
The Smallest no from the array is : 22
The Largest no from the array is : 88

*/