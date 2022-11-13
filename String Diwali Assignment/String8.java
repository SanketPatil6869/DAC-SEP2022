import java.util.Scanner;
class String8{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Enter the Character:");
		char ch=sc.next().charAt(0);
		int i=0;
	    int count=0;
		while(i< str.length())
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
			i++;
		}
		System.out.println("Result="+count);
	}
}