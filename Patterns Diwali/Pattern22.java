

class Pattern22
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		
		for(i=1 ; i<=7 ; i++)
		{
			for(j=1 ; j<=7-i ; j++)
			{
				System.out.print("1");
			}
			
			for(k=i ; k>=1 ; k--)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
}

/*
OUTPUT -
1111111
1111122
1111333
1114444
1155555
1666666
7777777
*/