import java.util.*;
class Collection8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		List<Integer>li=new LinkedList<>();
		System.out.println("Enter the no of element to be added");
		int q=sc.nextInt();
		System.out.println("Enter the Element");
		for(int i=1;i<=q;i++)
		{
			int s=sc.nextInt();
			li.add(s);
		}
		System.out.println(li);
	}
}
