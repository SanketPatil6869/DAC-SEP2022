import java.util.*;
class String25
{
    static boolean sentencePalindrome(String str)
    {   
        int l = 0;
        int h = str.length()-1;

        str = str.toLowerCase();

        while(l <= h)
        {
            char L1 = str.charAt(l);
            char H1 = str.charAt(h);

            if (!(L1 >= 'a' && L1 <= 'z'))
                l++;
             
            else if(!(H1 >= 'a' && H1 <= 'z'))
                h--;

            else if( L1 == H1)
            {
                l++;
                h--;
            }

            else
                return false;
        }

        return true;   
    }
 
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        //System.out.print("Enter a String : ");
        String str =sc.nextLine();
        
        if( sentencePalindrome(str))
        {
          System.out.println("Sentence is palindrome");
        }
        else
        {
            System.out.println("Sentence is not palindrome");
        }
    }
}
