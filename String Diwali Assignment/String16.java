import java.util.*;
class String16
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String x=sc.nextLine();
       Set<Character> set=new LinkedHashSet<>();
       for(int i=0;i<x.length();i++)
       {
            set.add(x.charAt(i));
       }
       for(char c:set)
           System.out.print(c);
   }
}