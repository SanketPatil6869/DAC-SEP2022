import java.util.*;
class A17
{
  public static void main(String []args)
  {
     Scanner s=new Scanner(System.in);
      int element=s.nextInt();
      for(int i=1;i<99;i++)
      {
          int j=s.nextInt();
          element=element^j;
      }
      for(int i=1;i<=100;i++)
           element=element*i;
      System.out.println(element);
  }
}