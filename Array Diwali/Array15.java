class Array15
{
	static void missing(int a[])
	{
		for(int i=1;i<101;i++)
		{
			if(boolean(a.contains(i))==false)
				System.out.println(i);
				
			
		}
	}
	public static void main(String args[])
	{
		int a[]={1,5,8,9};
		
		missing(a);
	}
}