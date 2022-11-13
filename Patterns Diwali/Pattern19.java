
class Pattern19
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		
		for(i=1 ; i<=7 ; i++)
		{
			for(j=1 ; j<=i ; j++)
			{
				System.out.print(j);
			}
			for(k=i-1 ; k>=1 ; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
1
121
12321
1234321
123454321
12345654321
1234567654321
*/