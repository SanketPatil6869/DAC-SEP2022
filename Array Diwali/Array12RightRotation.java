class Array12RightRotation {
 
    // To right rotate arr[] of size N by D
    void rightRotate(int arr[], int d, int n)
    {
 
        // If arr is rotated n times then you get the same array
       
        while (d > n) {
            d = d - n;
        }
 
        // Creating a temporary array of size d
        int temp[] = new int[n - d];
 
        // Now copying first N-D element in array temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[i];
 
        // Moving the rest element to index zero to D
        for (int i = n - d; i < n; i++)
			{
                arr[i - n + d] = arr[i];		
			}
 
        // Copying the temp array element in original array
        for (int i = 0; i < n - d; i++) 
			{	
				arr[i + d] = temp[i];
			}
    }
 
    // To print an array
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
            
    }

    public static void main(String[] args)
    {

        Array12RightRotation rotate = new Array12RightRotation();
 
        int arr[] = { 1, 2, 3, 4, 5 };
 
        rotate.rightRotate(arr, 2, arr.length);

        rotate.printArray(arr, arr.length);
    }
}