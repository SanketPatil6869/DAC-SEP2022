//Write a Java program to empty an hash set.

import java.util.*;

  public class C16 {
  public static void main(String[] args) {
         // Create a empty hash set
     HashSet<String> h_set = new HashSet<String>();
   // use add() method to add values in the hash set
          h_set.add("R");
          h_set.add("G");
          h_set.add("B");
          h_set.add("W");
          h_set.add("P");
          h_set.add("Y");
    System.out.println("Original Hash Set: " + h_set);
    // Remove all elements
    h_set.removeAll(h_set);
    System.out.println("Hash Set after removing all the elements "+h_set);   
   }
}
