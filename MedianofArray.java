
import java.util.*;
class MedianofArray{
    public static void getMedian(int arr[] , int n )
    {  Arrays.sort(arr);
        // even no of element
        if(n%2==0)
        {
            // avg of two mid element
            int ide1 = (n/2) - 1;
            int ide2 = (n/2);
            System.out.println((double)(arr[ide1]+arr[ide2])/2);

        }
        else{
            System.out.println(arr[n/2]);
        }
    }

    public static void main (String args[])
    {
        int arr [] = {2,5,1,7};
        int n = 4;
        System.out.println("median of the array is");
        getMedian(arr, n);
    }
}