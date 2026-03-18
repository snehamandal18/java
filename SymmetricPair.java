
import java.util.*;
public class SymmetricPair{
    public static void findSymmetricPair(int [][]arr)
    {
        System.out.println("Symmetric pairs :");
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++)
        {
            int first = arr[i][0];
            int second = arr[i][1];
            if(map.containsKey(second) && map.get(second)==first){
                System.out.print("("+ first + " "+ second +")");
            }
            else
            {
                map.put(first,second);
            }

        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        findSymmetricPair(arr);
    }
}