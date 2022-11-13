
import java.util.*;  
 
class Collection_04_SortArrayListExample1  
{   
	public static void main(String args[])   
	{   

	ArrayList<String> list = new ArrayList<String>();   
 
	list.add("Virat");   
	list.add("Rahul");   
	list.add("Hardik");   
	list.add("Shikhar");   
	list.add("Chahal");   
	list.add("Arshdeep");   
	list.add("Rohit");  
	list.add("Bumrah");
	 
	System.out.println("\nBefore Sorting: "+ list);   

	Collections.sort(list);   

	System.out.println("After Sorting: "+ list);   
	}   
}  