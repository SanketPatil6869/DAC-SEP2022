import java.util.*;
class Collection7{
	public static void main(String args[]){
		List<String>li=new ArrayList<String>();
		li.add("green");
		li.add("yellow");
		li.add("red");
		li.add("pink");
		li.add("white");
		li.add("black");
	System.out.println("Using Normal Print");
	System.out.println(li);
	System.out.println("Using For Each");	
	for(String s:li)
	{
		System.out.println(s);
	}
	System.out.println("Using Iterator");
	Iterator<String>it=li.iterator();
	while(it.hasNext())
	{
		String s=it.next();
		System.out.println(s);	
	}
	System.out.println("Using ListIterator");
	ListIterator<String>listit=li.listIterator();
	while(listit.hasNext())
	{ 
		String s=listit.next();
		System.out.println(s);
	}
	System.out.println("Using Enumeration");
	Enumeration<String> en= Collections.enumeration(li);
	while(en.hasMoreElements())
	{
		String s=en.nextElement();
		System.out.println(s);
	}
	System.out.println("Using Lambda Expression");
	 li.forEach(i-> {System.out.println(i);});
	
	}
}