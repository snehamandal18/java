
class StrongNo{
    public static int getFact(int n)
    {
        int fact=1;
        for(int i=1 ; i<=n ; i++)
        {
            fact = fact*i;
        }
        return fact;
    }

    public static void checkStrong(int n)
    {
        int temp = n;
        int sum = 0;
        while(n>0)
            {
                int digit = n%10;
                sum = sum + getFact(digit);
                n = n/10;

            } 
         if(sum == temp)
            {
                System.out.println("Yes");
            }  
         else{
             System.out.println("No");
         }    

    } 

    public static void main (String[] args)
    {
        int n = 145;
        checkStrong(n);
    }
}