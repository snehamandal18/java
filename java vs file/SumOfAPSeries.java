public class SumOfAPSeries {
    public static int getSum(int n , int a , int d)
    {
        int sum = 0;
        for(int i=1 ; i<= n ; i++)
        {
            sum += a;
            a += d;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 4;
        int a = 2 ;
         int d = 2;
         System.out.println(getSum(n, a, d));
    }
}
