//Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

class Array3
{
	static int count = 0;
	static void getSum(int arr[],int sum)
	{
		for(int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if ((arr[i]+arr[j])==sum)
				{
					count++;
				}
			}
		}
		System.out.println("Pairs of elements are : "+count);
	}
	public static void main (String args[])
	{
		int arr[] = {1,5,8,4,-3,7,2,9};
		
		int sum = 6;
		
		getSum(arr,sum);
	}
}