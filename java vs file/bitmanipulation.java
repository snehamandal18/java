
import java.util.*;
public class bitmanipulation{
    public static void evenodd(int n)
    {
        int bitmask=1;
        if((n & bitmask)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public static void getithbit(int n,int i)
     {
        int bitmask=1<<i;
        if((n&bitmask)==0)
        {
            System.out.println("0");
        }
        else{
             System.out.println("1");
        }

     }
     public static int setithbit(int n,int i)
     {
        int bitmask=1<<i;
        return (n|bitmask);
       

     }
      public static int clearithbit(int n,int i)
     {
        int bitmask=~(1<<i);
        return (n&bitmask);
       

     }

     public static int updateithbit(int n,int i,int newbit)
     {
        if(newbit==0)
        {
            return clearithbit(n,i);
        }
        else
        {
            return setithbit(n,i);
        }
     }

     public static int clearIbits(int n,int i)
     {
        int bitmask=~(0)<<i;
        return (n&bitmask);
       

     }

     public static int clearIbitsinrange(int n,int i,int j)
     {  int a=((~0)<<(j+1));
        int b=((1<<i)-1);
        int bitmask=a|b;
        return (n&bitmask);
       

     }

     // count set bits of n numbers
     public static int countsetbits(int n)
     {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
           n= n>>1;
        }
        return count;
     }

    public static void main(String args[])
    {
       // evenodd(2);
        //evenodd(5);

        //getithbit(10,3);
         // System.out.println (setithbit(10,2));
         // System.out.println (clearithbit(10,1));
          //System.out.println (updateithbit(10,2,1));
          // System.out.println (clearIbitsinrange(10,2,4));
         System.out.println( countsetbits(10));

    }
}