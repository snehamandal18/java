
import java.util.*;

public class RemoveDupUnsortedArray{
    public static List<Integer> removeDuplicate(int arr[])
    {
        HashMap<Integer,Boolean> seen = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for(int val : arr)
        {
            if(! seen.containsKey(val))
            {
                res.add(val);
                seen.put(val,true);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 4, 2, 2, 3, 1};
        List<Integer> result = removeDuplicate(arr);
        System.out.println("Array after removing duplicates: ");
        for(int x : result)
        {
            System.out.print(x+" ");
        }
    }
    
}
