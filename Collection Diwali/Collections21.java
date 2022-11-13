//21. Write a Java program to remove all the elements from a priority queue

import java.util.*;

public class Collections21 
{
  public static void main(String[] args) 
  {
   
	  PriorityQueue<String> pq1 = new PriorityQueue<String>();  
	  pq1.add("Red");
	  pq1.add("Green");
	  pq1.add("Black");
	  pq1.add("White");
	  
    System.out.println("Original Priority Queue: "+pq1);
   
    pq1.clear();   // clear all elemnts from PQ
 
    System.out.println("The New Priority Queue: " + pq1);
  } 
}