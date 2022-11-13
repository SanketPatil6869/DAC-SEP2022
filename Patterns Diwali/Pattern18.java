

class Pattern18
{
	public static void main(String args[])
	{
		int i;
		int j;
		
		for(i=1 ; i<=7 ; i++)
		{
			for(j=7 ; j>=8-i ; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
7
76
765
7654
76543
765432
7654321
*/