class RotationbyK{
    public static void reverse(int arr[] , int st, int ed)
    {
        while(st<ed)
        {
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
    }
  public static void leftRotation(int arr[] , int k)
  {
      int n= arr.length;
      if(k>n) k=k%n;
      if(k==0) return;

      //reverse first k element
      reverse(arr, 0, k-1);
      //reverse n-k elements
      reverse(arr, k, n-1);
      //reverse whole array
      reverse(arr, 0, n-1);
  }
   public static void rightRotation(int arr[] , int k)
  {
    int n = arr.length;
    // right rotation by k = left rotation by n-k element
    leftRotation(arr, n-(k%n));
  }
  public static void main (String args[])
  {
    int arr[] = {1,2,3,4,5};
    leftRotation(arr, 2);
    System.out.print("left rotation:");
    for(int x:arr)
    {
        System.out.print(x+" ");
    }
    System.err.println();
    int arr1[] = {1,2,3,4,5};
    rightRotation(arr1, 2);
    System.out.print("right rotation:");
    for(int x:arr1)
    {
        System.out.print(x+" ");
    }

  }
}