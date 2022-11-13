import java.util.*;
class Collections12 
{
	public static void main(String[] args)
	{
 
		LinkedList <String> list = new LinkedList <String> ();
          list.add("10");
          list.add("20");
          list.add("30");
          list.add("40");
          list.add("50");
          System.out.println("Original linked list: " + list);
           
   boolean x=list.contains("20");
   System.out.println("Element present in the list: "+x);
   
    boolean y=list.contains("60");
   System.out.println("Element present in the list: "+y);
    
 }
}
