import java.util.HashMap;
import java.util.*;
class Collection25
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Shubham", 1);
        map.put("Saurabh", 2);
        map.put("Sanket", 3);
        map.put("Shrikrishna", 4);
		
		
        System.out.println("Size of map is : "+ map.size());
		System.out.println();

        System.out.println("Given map is : "+map);
		System.out.println();
		
        Scanner ss= new Scanner(System.in);
        System.out.print("Enter element of map :");
        String str= ss.nextLine();
		
        if (map.containsKey(str))
        {
			Integer a = map.get(str);
            System.out.println("value for key "+str+" is: " + a);
        }
		else
		{
			System.out.println("Enter element is not in map");
		}
    }
}