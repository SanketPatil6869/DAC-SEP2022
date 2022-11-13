

class Pattern11
{
	public static void main(String args[])
	{
		char i;
		char j;
		
		for(i=65 ; i<=70 ; i++)
		{
			for(j=65 ; j<=65+(70-i) ; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(i=65 ; i<=70 ; i++)
		{
			for(j=65 ; j<=i ; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
ABCDEF
ABCDE
ABCD
ABC
AB
A
A
AB
ABC
ABCD
ABCDE
ABCDEF
*/