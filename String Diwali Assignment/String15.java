import java.util.*;
 
class String15 {
     
    static void removeDuplicate(char str[], int n)
    {
       
        HashSet<Character> s = new LinkedHashSet<>(n - 1);
      
        for (char x : str)
            s.add(x);
 
        // Print content of the set
        for (char x : s)
            System.out.print(x);
    }
 
    
    public static void main(String[] args)
    {
        char str[] = "geeksforgeeks".toCharArray();
        int n = str.length;
 
        removeDuplicate(str, n);
    }
}