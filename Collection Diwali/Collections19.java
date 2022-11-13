//19. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

import java.util.*;
class Collections19
{
	public static void main(String args[])
	{
		TreeSet <String> tree_set = new TreeSet<String>();
		tree_set.add("Red");
		tree_set.add("Yellow");
		tree_set.add("Pink");
		tree_set.add("Black");
		tree_set.add("Purple");
		System.out.println("Tree set");
		System.out.println(tree_set);
	}
}

/*
Tree set
[Black, Pink, Purple, Red, Yellow]
*/