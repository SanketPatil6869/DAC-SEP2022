

class Pattern12
{
	public static void main(String args[])
	{
		char i;
		char j;
		char k;
		
		for(i=65 ; i<=70 ; i++)
		{
			for(j=(char)(65+70-i) ; j>65 ; j--)
			{
				System.out.print(" ");
			}
			for(k=65 ; k<=i ; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
*/