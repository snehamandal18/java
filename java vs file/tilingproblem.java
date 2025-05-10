
import java.util.*;
public class tilingproblem{
    public static int tiles(int n)
    {
        //base case
        if(n==0||n==1)
        {
            return 1;
        }
        //vertical 
        int fnm1=tiles(n-1);
        //horizontal
        int fnm2=tiles(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String args[])
    {
      System.out.println(tiles(4));
 
    }
}