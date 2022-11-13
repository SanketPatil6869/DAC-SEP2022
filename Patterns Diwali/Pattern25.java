

class Pattern25
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		
		for(i=1 ; i<=7 ; i++)
		{
			for(j=i ; j<=7 ; j++)
			{
				System.out.print(j);
			}
			
			for(k=1 ; k<=i-1 ; k++)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	}
}

/*
OUTPUT - 
1234567
2345671
3456712
4567123
5671234
6712345
7123456
*/