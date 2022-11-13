
import java.util.*;

class Pattern13
{
	public static void main(String args[])
	{
		char i;
		char j;
		char k;
		char l;
		
		System.out.println("\nEnter the size in odd of the Alphabet Diamond you wish to see !\nOdd, since it's centreline is share by upper and lower triangle");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int diamondSize = size/2;
		System.out.println("\nSize of Alphabet Diamond you wish to see : "+size);
		
		for(i=65 ; i<=(65+diamondSize) ; i++)
		{
			for(k=(char)(65+((65+diamondSize)-i)) ; k>65 ; k--)
			{
				System.out.print(" ");
			}
			
			for(j=65 ; j<=i ; j++)
			{
				if((j==65))
				System.out.print(i);
			}
			
			for(k=66 ; k<=i ; k++)
			{
				System.out.print(" ");
			}
			
			for(k=67 ; k<=i ; k++)
			{
				System.out.print(" ");
			}
			
			for(j=66 ; j<=i ; j++)
			{
				if((j==i))
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		int q=0;
		for(i=65 ; i<=(65+(diamondSize-1)) ; i++)
		{
			int p=0;
			
			for(k=65 ; k<=i ; k++)
			{
				System.out.print(" ");
			}
			for(j=(char)(65+((65+(diamondSize-1))-i)) ; j>=65 ; j--)
			{
				if(p==0)
				System.out.print(j);
				p=p+1;
			}

			for(l=65 ; l<i+(((diamondSize-1)*2)-1)+q ; l++)
			{
				System.out.print(" ");
			}
			q=q-3;
			
			p=0;
			for(j=(char)(65+((65+(diamondSize-1))-i)) ; j>65 ; j--)
			{
				if(p==0)
				System.out.print(j);
				p=p+1;
			}
			System.out.println();
		}
	}
}


/*
The upper half of the diamond and lower half have diff swt of logic regardinf the space inside diamond, the upper trainfle was dplit into two different space traingle's and were iterated inside the big outer for loop, whereas in case of lower triangle the spaces were filled entirely by one triangle logic, i.e: by one inner for() loop only, which required it's no of iterations to vary by 2 for each iteration of outer for loop, since,the requirement of spaces on each line was varying. eg: for 5 rows of lower triangle for diamond size 11 had spaces on each rows as 7,5,3,1 on (fifth, fourth, third & second)last rows respectively, which was taken care by special logic 
*/

/*
OUTPUT -
Enter the size in odd of the Alphabet Diamond you wish to see !
Odd, since it's centreline is share by upper and lower triangle
21

Size of Alphabet Diamond you wish to see : 21
          A
         B B
        C   C
       D     D
      E       E
     F         F
    G           G
   H             H
  I               I
 J                 J
K                   K
 J                 J
  I               I
   H             H
    G           G
     F         F
      E       E
       D     D
        C   C
         B B
          A
*/