

class Pattern10
{
	public static void main(String args[])
	{
		char i;
		char j;
		
		for(i=65 ; i<=70 ; i++)
		{
			for(j=65 ; j<=i ; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
A
BB
CCC
DDDD
EEEEE
FFFFFF
*/