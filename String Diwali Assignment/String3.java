// How to check if two Strings are anagrams of each other?
import java.util.*;
class String3
{
	static char chrr1[];
	static char chrr2[];
	
	static int areAnagrams(char ch1[], char ch2[])
	{
		chrr1 = ch1;
		chrr2 = ch2;
		
		if (ch1.length != ch2.length)
			return -1;
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<ch1.length; i++)
		{
			if (ch1[i] != ch2[i])
				return -1;
		}
		return 1;
		
	}
	public static void main (String args[])
	{
		String str1 = "Patil";
		String str2 = "atPli";
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		int val = areAnagrams(ch1,ch2);
		if (val == 1)
			System.out.println("Two Strings are anagrams of each other");
		else
			System.out.println("Two Strings are not anagrams of each other");
	
	}
}

