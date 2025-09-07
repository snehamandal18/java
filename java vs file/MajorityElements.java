
import java.util.*;
public class MajorityElements{

    public static void main (String args[])
    {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map= new HashMap<>();
       
        for(int i=0; i<arr.length;i++ )
        {
             int nums=arr[i];
            if(map.containsKey(nums))
            {
                map.put(nums,map.get(nums)+1);
            }
            else
            {
               map.put(nums,1);
            }
        }
        Set<Integer> keyset= map.keySet();
        for(Integer key: keyset )
        {
            if(map.get(key)>arr.length/3)
            {
                System.out.println(key);
            }
        }
    }
}