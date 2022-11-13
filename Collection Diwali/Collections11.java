import java.util.LinkedList;
import java.util.Iterator;
class Collections11
{
	public static void main(String [] args)
	{
		LinkedList<String> list=new LinkedList<>();
		
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");
		
		System.out.println("Element of LinkedList:"+list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Element at index "+i+"= "+list.get(i));
			
		}
	}
}