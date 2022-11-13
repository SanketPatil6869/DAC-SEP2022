//User Input
import java.util.*;
class Collection9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		LinkedList<String> li=new LinkedList<String>();
		li.add("red");
		li.add("green");
		li.add("pink");
		li.add("yellow");
		System.out.println(li);
		System.out.println("Enter the Position");
		int i=sc.nextInt();
		System.out.println("Enter the Color");
		String col=sc.next();
		li.add(i,col);
		System.out.println("Updated Color List");
		System.out.println(li);
	}
}
/*
Output==>
[red, green, pink, yellow]
Enter the Position
3
Enter the Color
BLUE
Updated Color List
[red, green, pink, BLUE, yellow]

*/

/*	
import java.util.*;
class Collection9{
	public static void main(String args[]){
		LinkedList<String> li=new LinkedList<String>();
		li.add("red");
		li.add("green");
		li.add("pink");
		li.add("yellow");
		System.out.println(li);
		System.out.println("Add At Specific Position");
		li.add(1,"BLACK");
		System.out.println(li);
		System.out.println("Add At Specific Position");
		li.add(4,"WHITE");
		System.out.println(li);
		
	}
}
Output==>
[red, green, pink, yellow]
Add At Specific Position
[red, BLACK, green, pink, yellow]
Add At Specific Position
[red, BLACK, green, pink, WHITE, yellow]	
*/
		
		