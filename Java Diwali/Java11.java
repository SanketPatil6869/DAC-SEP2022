import java.util.*;
class Addition
{
	int a;
	int b;
		void setValues(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
		void printSum()
		{
			int sum=a+b;
			System.out.println("SUM="+sum);
		}

}
class Java11
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		
		Addition obj=new Addition();
		obj.setValues(a,b);
		obj.printSum();
	}
}