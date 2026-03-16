 class RemoveDuplicates{
    public static int duplicates(int arr[])
    {
        int n = arr.length;
        if(n==0) return 0;
        int i=0;
        for(int j=1 ; j<n ; j++)
        {
            if(arr[j] != arr[i])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int k = duplicates(arr);
        System.out.println("unique elements:"+k);
        System.out.println("array after removing duplicates:");
        for(int i=0 ; i<k ; i++)
        {
            System.out.print( arr[i]+" ");
        }
    }
}
