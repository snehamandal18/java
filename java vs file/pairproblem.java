
import java.util.*;
public class pairproblem{
    public static int frndspair(int n)
    {
        //base case
        if(n==1||n==2)
        {
            return n;
        }
        //choice
        //single
        int fnm1=frndspair(n-1);
        //pair
        int fnm2=frndspair(n-2);
        int pairways=(n-1)*fnm2;
        int totalways=fnm1+pairways;
        return totalways;
    }
    public static void main (String args[])
    {
       System.out.println(frndspair(1));
    }
}