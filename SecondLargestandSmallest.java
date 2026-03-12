
class SecondLargestandSmallest{

    // function for 2nd smallest
    public static int findSecondSmallest(int arr[] , int n){
        if(n<2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i] < small)
            {
                second_small = small;
                small = arr[i];
            }
            else if(arr[i] < second_small && arr[i]!=small)
            {
                second_small = arr[i];
            }
        }
        return second_small;

    }
  // function of 2nd largest element
    public static int findSecondLargestest(int arr[] , int n){
        if(n<2){
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }
            else if(arr[i] > second_large && arr[i]!=large)
            {
                second_large = arr[i];
            }
        }
        return second_large;

    }

    public static void main (String args[])
    {
        int arr[] = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        int ss = findSecondSmallest(arr, n);
        int sl = findSecondLargestest(arr, n);
        System.out.println("second Smallest element :" + ss);
         System.out.println("second largest element :" + sl);
    }
}