import java.util.*;
class A18
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int x[]=new int[n];
     for(int i=0;i<n;i++)
         x[i]=sc.nextInt();
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<n;i++)
     {
        map.put(x[i],map.getOrDefault(x[i],0)+1);
     }
  for(int i:map.keySet())
  {
      if(map.get(i)>1)
          System.out.println("duplicate present:"+i);
  }
}
}