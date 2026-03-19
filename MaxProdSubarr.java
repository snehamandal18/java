public class MaxProdSubarr {
    public static int maxProd(int arr[])
    {
        int res = arr[0];
        int maxProd = arr[0];
        int minProd = arr[0];
        for(int i=1 ; i<arr.length ; i++)
        {
            int curr = arr[i];
            if(curr<0)
            { 
                //swap maxprod and min prod
                int temp = maxProd;
                maxProd = minProd;
                minProd=temp;
            }
            maxProd = Math.max(curr , curr*maxProd);
            minProd = Math.min(curr , curr*minProd);
            res = Math.max(res,maxProd);

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,-3,0,-4,-5};
        System.out.println(maxProd(arr));
    }
}
