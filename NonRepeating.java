
import java.util.*;
public class NonRepeating{
    public static void getNonRepeatElement(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr)
        {
            map.put(x,map.getOrDefault(x, 0)+1);

        }
        System.err.println("non repeating numbers : ");
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            if(en.getValue()==1)
            {
                System.err.print(en.getKey()+" ");
            }
            
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,2,5,6,5,7};
       getNonRepeatElement(arr);
    }
}