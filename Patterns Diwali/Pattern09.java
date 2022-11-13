

class Pattern09
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		int l;
		
		for(i=1 ; i<=5 ; i++)
		{
			for(j=1 ; j<i ; j++)
			{
				System.out.print(" ");
			}
			
			for(k=i ; k<=5 ; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(i=1 ; i<=4 ; i++)
		{
			for(j=4-i ; j>=1 ; j--)
			{
				System.out.print(" ");
			}
			
			for(k=5-i ; k<=5 ; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
*/