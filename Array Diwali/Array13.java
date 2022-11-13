class Array13
{
	static int partition(int arr[], int low, int high)
	{
		//consider pivot as last element
		int pivot = arr[high];
		//consider no element is before pivot
		int i = low-1;
		
		for (int j=low; j<high; j++)
		{
			if (arr[j] < pivot)
			{
				//if element is small than pivot then create 1 space for store that element
				i++;
				//swap that element 
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		//now all elements are smaller than pivot are at begining and pivot is still last element
		//so create one more space after smaller element and swap pivot with the next element after ith index.
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		//return pivot index that is i
		return i;
	}
	static void sorting(int arr[],int low, int high)
	{
		if (low < high)
		{
			//return pivot index from partition
			int pivotIdx = partition(arr,low,high);
			
			sorting(arr,low,pivotIdx-1);
			sorting(arr,pivotIdx+1,high);
		}
	}
	public static void main (String args[])
	{
		int arr[] = {5,6,2,4,3};
		sorting(arr,0,arr.length-1);
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}