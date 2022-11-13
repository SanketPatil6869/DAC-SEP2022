import java.util.LinkedList;
class Collections10 
{
  public static void main(String[] args)
  {
  
     LinkedList<String> list = new LinkedList<String>();
  
          list.add("10");
          list.add("20");
          list.add("30");
     System.out.println("Original linked list:" + list);    
  
    list.addFirst("40");
	
    list.addLast("50");
     System.out.println("Final linked list:" + list);  
 }
}