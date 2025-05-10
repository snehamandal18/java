import java.util.*;
public class imp{

    public static int trappedrainwater(int height[])
    {
        // calculate leftmax boundary--array
        int leftmax[]= new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate rightmax boundary--array
        int rightmax[]= new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
      
        //loop
        int trappedwater=0;
        for(int i=1;i<height.length;i++)
        {
            // waterlevel=min(leftmax,rightmax)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            // calculate trappedwater=(waterlevel-height[i])
            trappedwater+=(waterlevel-height[i]);
            
        }
        return trappedwater;
    } 

    public static int buyandsell(int prices[])
    {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])
            {
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);

            }
            else
            {
                buyprice=prices[i];

            }
        } 
        return maxprofit;
    }
   public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);

    //trappedwater
     /* int height[]={4,2,0,6,3,2,5};
      System.out.println("total trapped rain water is:"+trappedrainwater(height));
      */

    //buy&sellstocks
     int prices[]={7,1,5,3,6,4};
     System.out.println("maximum profit is:"+buyandsell(prices));
    }

}
