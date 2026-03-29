class GpSum{
    public static double getSumOfGp(double a , double r , int n)
    {
        double sum = 0 ;
        double term = a;
        for(int i=0 ; i<n ; i++)
        {
            sum += term;
            term *= r;

        }
        return sum;
       
    }
    public static void main (String [] args)
    {
        double a = 3;
        double r = 5;
        int n = 2;
        System.out.println(getSumOfGp(a, r, n));

    }
}