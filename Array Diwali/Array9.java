import java.util.Scanner;
class Array9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				int m=i*i;
				System.out.print(m+" ");
			}
			else
			{
				int n=i*i*i;
				System.out.print(n+" ");
			}
		}
		
	}
}
/*
Enter the Value
6
1 4 27 16 125 36
*/
