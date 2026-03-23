
class primeInRange{
    public static boolean checkPrime(int n)
    {
       int cnt = 0;
       for(int i=1 ; i<=n ; i++)
       {
        if(n%i ==0)
        {
            cnt++;
        }
       }
       return cnt == 2;
    }
    public static void main(String[] args) {
        int a = 2, b = 10;
        for(int i=a ; i<=b ; i++)
        {
            if(checkPrime(i))
            {
              System.out.print(i+" ");
            }
        }
    }
}