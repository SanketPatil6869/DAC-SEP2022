
class String_04_FirstNonRepeatedCharacterOfString
{

	public static void FirstNonRepeat(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if (str.indexOf(str.charAt(i), str.indexOf(str.charAt(i)) + 1) == -1) {
				System.out.println("\nFirst non-repeating character is "+ str.charAt(i));
				break;
			}
		}
		return;
	}
	
	public static void main (String[] args)
	{
		String str = "peekstorpeeks";
		FirstNonRepeat(str);
	}
}

// above code can also be done by 
// First non-repeating character using HashMap and two string traversals.