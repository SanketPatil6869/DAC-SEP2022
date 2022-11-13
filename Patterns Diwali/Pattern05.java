

class Pattern05
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		int l;
		
		for(i=1 ; i<=4 ; i++)
		{
			for(j=4-i ; j>=1 ; j--)
			{
				System.out.print(" ");
			}
			
			for(k=i ; k>=1 ; k--)
			{
				System.out.print(k);
			}
			
			for(l=2 ; l<=i ; l++)
			{
				System.out.print(l);
			}
			
			System.out.println();
		}
		
		for(i=1 ; i<=3 ; i++)
		{
			for(j=1 ; j<=i ; j++)
			{
				System.out.print(" ");
			}
			
			for(k=4-i ; k>=1 ; k--)
			{
				System.out.print(k);
			}
			
			for(l=2 ; l<=4-i ; l++)
			{
				System.out.print(l);
			}
			
			System.out.println();
		}
	}
}

/*
OUTPUT - 
   1
  212
 32123
4321234
 32123
  212
   1
*/