

class Pattern02
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k;
		int l;
		
		for(i=1 ; i<=5 ; i++)
		{
			if(i==1)
			{
				for(j=1; j<=((5*2)+4) ; j++)
				{
					System.out.print("*");
				}
				System.out.println();
				continue;
			}
			
			/*
			if(i==1)
			{
				System.out.println();
				continue;
			}
			*/
			
			for(k=1 ; k<i ; k++)
			{
				System.out.print(" ");
			}
			
			for(l=6-i ; l>=1 ; l--)
			{
				if((l==(6-i)) || (l==1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
**************
 *     *
  *   *
   * *
    *
*/



/*
Pattern02.java:39: error: bad operand types for binary operator '||'
                                if((5-i) || (l==1))
                                         ^
  first type:  int
  second type: boolean
*/

//=================		Make use of nos inside spaces to check the flow		=========

/*
**************
0*   *
00* *
000*
0000

C:\Users\SANKET TALEKAR\Desktop\Sept22\ZZ Diwali Activities\Challenge\01 Coding\01 Pattern Based (logical)>javac Pattern02.java

C:\Users\SANKET TALEKAR\Desktop\Sept22\ZZ Diwali Activities\Challenge\01 Coding\01 Pattern Based (logical)>java Pattern02
**************
0*     *
00*   *
000* *
0000*
*/