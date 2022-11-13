import java.util.*;
class String11_12
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the string");
	   String str=sc.nextLine();   
        str = str.trim();    //The trim() method removes whitespace from both ends of a string.
          
        str = str.replaceAll("\\s", "%20"); // Replace All space (unicode is \\s) to %20
         
        System.out.println(str);
    }
}