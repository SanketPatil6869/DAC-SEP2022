
class Pattern20
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		
		for(i=1 ; i<=7 ; i++)
		{
			for(j=1 ; j<i ; j++)
			{
				System.out.print(" ");
			}
			
			for(k=i ; k<=7 ; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		for(i=1 ; i<=6 ; i++)
		{
			for(j=6-i ; j>=1 ; j--)
			{
				System.out.print(" ");
			}
			
			for(k=7-i ; k<=7 ; k++)
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
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
*/