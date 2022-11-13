//Write a Java program to convert a hash set to an array.

import java.util.*;
  public class C17 {
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
      // Creating an Array
      String[] narray = new String[h_set.size()];
      h_set.toArray(narray);
 
     // Displaying Array elements
     System.out.println("Array elements: ");
      for(String element : narray){
        System.out.println(element);
     }
   }
}
