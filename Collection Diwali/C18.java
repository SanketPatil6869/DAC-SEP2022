//Write a Java program to compare two sets and retain elements which are same on both sets.

import java.util.*;
  public class C18 {
  public static void main(String[] args) {
     // Create a empty hash set
        HashSet<String> h_set1 = new HashSet<String>();
     // use add() method to add values in the hash set
          h_set1.add("R");
          h_set1.add("G");
          h_set1.add("B");
          h_set1.add("W");
          System.out.println("Frist HashSet content: "+h_set1);
          HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("R");
          h_set2.add("P");
          h_set2.add("B");
          h_set2.add("O");
          System.out.println("Second HashSet content: "+h_set2);
          h_set1.retainAll(h_set2);
          System.out.println("HashSet content:");
          System.out.println(h_set1);
     }
}
