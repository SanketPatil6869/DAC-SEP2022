class Array12LeftRotation{
	void leftRotate(int test_arr[], int k, int n)
	{
		// Creating temp array of size k
		int temp[] = new int[k];

		// Copying first k element in array temp
		for (int i = 0; i < k; i++)
			temp[i] = test_arr[i];

		// shifting remaining elements of the array by k position to the left
		for (int i = k; i < n; i++) {
			test_arr[i - k] = test_arr[i];
		}

		// storing back the k elements to the original array
		for (int i = 0; i < k; i++) {
			test_arr[i + n - k] = temp[i];
		}
	}

	// To print elements of an array
	void printArrayElements(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}


	public static void main(String[] args)
	{
		Array12LeftRotation obj = new Array12LeftRotation();

		int test_arr[] = { 1, 2, 3, 4, 5 };
		int k = 2;

		obj.leftRotate(test_arr, k, test_arr.length);
		obj.printArrayElements(test_arr, test_arr.length);
	}
}