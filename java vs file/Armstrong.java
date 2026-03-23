public class Armstrong {
    public static boolean checkArmstrong(int n)
    {
        int temp = n;
        int sum = 0;
        while(n>0)
        {
                int digit = n%10;
                 sum += Math.pow(digit,3);
                n = n/10;

        } 
        return sum == temp;
    }

    public static void main(String[] args) {
        int a = 153;
        if(checkArmstrong(a))
        {
            System.out.print("armstrong no");
        }
        else{
             System.out.print("not a armstrong no");
        }
    }
    
}
