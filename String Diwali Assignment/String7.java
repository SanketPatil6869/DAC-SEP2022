import java.util.Scanner;
class String7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int c;
		
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{ 
			c=1;
			for(int j=i+1; j<arr.length;j++)
			{
				if ((arr[i]==arr[j]) && arr[i] != ' ')
				{
					c++;
				}
			}
			if(c>1)
			{
				System.out.println(arr[i]+":"+c);
			}
		}
	}	
}