import java.util.*;
public class CountFreq {

     public static void frequency(int arr[] , int n)
     {
        HashMap<Integer,Integer> map = new HashMap<>();
        //input elements and frequency in the hashmap
        for(int i=0 ; i<n ; i++)
        {
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);

        }
        // traverse the map and print key and value
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
     } 

     public static void main (String args[])
     {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        frequency(arr, n);
     }
}

