

class Pattern15
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		
		for(i=1 ; i<=6 ; i++)
		{
			for(j=1 ; j<i ; j++)
			{
				System.out.print(" ");
			}
			for(k=i ; k<=6 ; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6
    5 6
     6
*/