
import java.util.*;
public class T5pairsum2{
    public static boolean pairsum2(ArrayList<Integer>list, int target )
    {   
        int bp=-1;
        //breaking point
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                bp=i;
                break;
            }
        }
        int lp=bp+1;//smallest
        int rp=bp;//largest
        int n=list.size();
        while(lp!=rp)
        {   //case1
            if(list.get(lp)+list.get(rp)==target){
             return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target)
            {
                 lp=(lp+1)%n;
            }    
            //case3
            else
            { 
                rp=(rp+n-1)%n;
            }    

        }
        return false;
    }

    public static void main (String args[])
    {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=50;
        System.out.println(pairsum2(list,target));
    }
}