import java.util.*;
public class HashMap_Operation{
   
public static void main(String args[])
{
    HashMap<String,Integer> hm = new HashMap<>();

    //insert -- O(1)
    hm.put("India",100);
    hm.put("China",150);
    hm.put("US",50);
    System.out.println(hm);
    
    // Get--O(1)
  System.out.println(hm.get("India"));
  System.out.println(hm.get("Indonesia"));

 //remove--O(1)
 System.out.println(hm.remove("China"));
 System.out.println(hm);

 //contains--O(1)
 System.out.println(hm.containsKey("India"));
  System.out.println(hm.containsKey("china"));




}
}