import java.util.ArrayList;
import java.util.HashSet;

public class RepeatingElement {
    public static ArrayList<Integer>  getRepeatElement(int arr[])
    {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i : arr)
        {
            if(!seen.contains(i)){
                seen.add(i);
            }
            else
            {
                res.add(i);
            }
        }
      return res;

    }
    public static void main(String[] args)
    {
        int arr[] = {1,1,2,2,3,4,4,5};
        ArrayList<Integer> ans = getRepeatElement(arr);
        for(int x : ans)
        {
            System.out.print(x+" ");
        }

    }
}
