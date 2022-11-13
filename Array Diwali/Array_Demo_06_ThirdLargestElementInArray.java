
// Java program to find third Largest element in an array of distinct elements without sorting

class Array_Demo_06_ThirdLargestElementInArray
{
	static void thirdLargest(int arr[])
	{
		
		if (arr.length < 3)
		{
			System.out.printf(" Invalid Input ");
			return;
		}

		int first = arr[0];
		for (int i=1 ; i<arr.length ; i++)
			if (arr[i] > first)
				first = arr[i];
			//System.out.printf("The first Largest " + "element is %d\n", first);

		int second = arr[0];
		for (int i=0 ; i<arr.length ; i++)
			if (arr[i] > second && arr[i] < first)
				second = arr[i];
			//System.out.printf("The second Largest " + "element is %d\n", second);

		int third = arr[0];
		for (int i=0 ; i<arr.length ; i++)
			if (arr[i] > third && arr[i] < second)
				third = arr[i];

			System.out.printf("The third Largest " + "element is %d\n", third);
	}


	public static void main(String []args)
	{
		int arr[] = {24,54,31,16,82,45,67};
		int n = arr.length;
		thirdLargest(arr);
	}
}
