

class Pattern07
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k=0;
		
		for(i=1 ; i<=5 ; i++)
		{
			for(j=1 ; j<=5 ; j++)
			{
				k^=1;
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

/*
output-
10101
01010
10101
01010
10101
*/


//=====================================================================
//---------------------------// METHOD 2 //----------------------------
//=====================================================================


/*
class Pattern07
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k=0;
		
		for(i=1 ; i<=5 ; i++)
		{
			for(j=1 ; j<=5 ; j++)
			{
				if(k==0)
				{
					k=1;
				}
				else if(k==1)
				{
					k=0;
				}
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

/*
output-
10101
01010
10101
01010
10101
*/