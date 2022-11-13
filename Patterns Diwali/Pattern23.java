

class Pattern23
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k=0;
		
		for(i=1 ; i<=7 ; i++)
		{
			for(j=1 ; j<=7 ; j++)
			{
				k^=1;
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
1010101
0101010
1010101
0101010
1010101
0101010
1010101
*/