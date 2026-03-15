import java.util.*;
public class AssendingandDecending {
    public static void rearrange(int arr[] , int n)
    {  
        // sort the whole array
        Arrays.sort(arr);
    // reverse the mid to last element of the array
        for(int i=n/2 , j=n-1 ; i<j ; i++ , j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main (String args[])
    {
        
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of the arr n : ");
        int n = sc.nextInt();
          int arr[] = new int[n];
          for(int i=0 ; i<n ; i++)
          {
            arr[i]= sc.nextInt();
          }
    
        rearrange(arr,n);
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }
}
