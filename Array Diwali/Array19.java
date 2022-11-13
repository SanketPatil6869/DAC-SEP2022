// 19. Write a program to sum all the values of a given Array in java? 

class Array19
{
	public static int sumofArray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String args[])
	{
		int arr[]={23,45,67,3,5,22,43,97};
		int sum = sumofArray(arr);
		System.out.println(sum);
	}
}

/*
OUTPUT:
305
*/