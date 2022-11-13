//20 .Write a program to remove a given character from String?



//20. Write a program to remove a given character from String?

import java.util.*;
class String20
{
	public static void removeChar(String s , char a)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==a)
				continue;
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.nextLine();
		System.out.println("Enter the character to delete :");
		char a=sc.next().charAt(0);		
		System.out.println("The string after deleting the character "+a+" is : ");
		removeChar(s,a);		
	}
}

/*
Enter the string
teamgogetters
Enter the character to delete :
e
The string after deleting the character e is :
tamgogttrs
*/