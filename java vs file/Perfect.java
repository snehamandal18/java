public class Perfect {
    public static boolean checkPerfect(int n)
    {
        int temp = n;
        int sum = 0;
       for(int i = 1 ; i<n ; i++ )
       {
        if(n%i == 0)
        {
           sum += i;
        }

       }
       return (temp == sum);
    } 
   
    public static void main(String[] args) {
        int n = 10;
        if(checkPerfect(n))
        {
            System.out.println("perfect");
        }
        else 
        {
            System.out.println("not perfect");
        }
    }
}
