/*
Java Program to Calculate Sum of Two Byte Values using Type Casting
*/

import java.util.*;

class Class26
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st No. : ");
		int  b=sc.nextInt();
		System.out.print("Enter 2nd No. : ");
		int c=sc.nextInt();
		
		byte d= (byte)(c+b);
		System.out.println("Sum of Given no. in byte : "+d);
	}
}