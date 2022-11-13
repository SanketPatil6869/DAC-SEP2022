import java.util.*;
class Array10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of array elements :");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int k=0;k<a.length;k++)
		{
			a[k]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				count++;
			}
		}
		if(count==(a.length-1))
		{
			System.out.println("Ascending order");
		}
		else
		{
				if(count!=0 && count!=(a.length-1))
					{
						System.out.println("Random order");
					}
				else 
				for(int j=0;j<a.length-1;j++)	
				{
				       if(a[j]>a[j+1])
						{
							count++;
						}
				}		
						if(count==(a.length-1))
						{
							System.out.println("Descending order");
						}
		}
		
		
	}
}