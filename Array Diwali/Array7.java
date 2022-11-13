class Array7{
	
	void function(int arr1[],int arr2[],int n1, int n2,int arr3[])
	{
		int i=0,j=0,k=0;
		while(i<n1 && j<n2)
		{
			arr3[k++]=arr1[i++];
			arr3[k++]=arr2[j++];
		}
		
		while(i<n1)
		{
			arr3[k++]=arr1[i++];
		}
		
		while(j<n2)
		{
			arr3[k++]=arr2[j++];
		}
	}
	public static void main(String args[]){
		Array7 a=new Array7();
		int arr1[]={1,3,5,7};
		int arr2[]={2,4,6,8,10};
		int n1=arr1.length;
		int n2=arr2.length;
	    int arr3[]=new int [n1+n2];
		a.function(arr1,arr2,n1,n2,arr3);	
	for(int i=0;i<(n1+n2);i++)
	{
		System.out.println(arr3[i]);
	}		
	}
}
		
		
		