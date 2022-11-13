
import java.util.*;

class ReverseArray
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
	
	static void methodReverseArray(int arr[])
	{
		int temp;
		for(int i=0 ; i<(arr.length/2) ; i++)
		{
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
	
	static void printArray(int arr[])
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

class Array_Demo_04_ReverseTheArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Size of an Array : ");
		int n = sc.nextInt();	
		int arr[] = new int[n];
		
		
		ReverseArray.inputArray(arr);
		System.out.println("\nArray before Reversing");	
		ReverseArray.printArray(arr);
		
		ReverseArray.methodReverseArray(arr);
		System.out.println("\nArray after Reversing");
		ReverseArray.printArray(arr);
	}
	
}

/*
OUTPUT - 

Enter the Array Elements
33
22
11

Array before Reversing
33
22
11

Array after Reversing
11
22
33

*/