

class Pattern01
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		
		for(i=1 ; i<5 ; i++)
		{
			for(j=5-i ; j>=1 ; j--)
			{
				System.out.print(" ");
			}
			for(k=1 ; k<=i ; k++)
			{
				if((k==1) || (k==i))
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		for(i=1 ; i<=((5*2)-1)+4 ; i++)
		{
			System.out.print("*");
		}		
	}
}

/*
OUTPUT - 
C:\Users\SANKET TALEKAR\Desktop\Sept22\ZZ Diwali Activities\Challenge\01 Coding\01 Pattern Based (logical)>java Pattern01
    *
   * *
  *   *
 *     *
*************
*/