
import java.util.*;
public class T4WaterContainer{
       
    public static int  storeWater(ArrayList<Integer>height)
    { 
        int lp=0;
        int rp=height.size()-1;
        int maxwater=0;
      while(lp<rp)
     {
        // 2 pointer approach
        
        //calculate area of water
        int ht=Math.min(height.get(lp),height.get(rp));
        int width=rp-lp;
        int currWater=ht*width;
        maxwater=Math.max(maxwater,currWater);

        // update pointer
        if(height.get(lp)<height.get(rp))
        {
            lp++;
        }
        else
        {
            rp--;
        }

      }
      return maxwater;
    } 

    public static void main(String [] args)
    {
        ArrayList <Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
    System.out.println(storeWater(height));
    }
}