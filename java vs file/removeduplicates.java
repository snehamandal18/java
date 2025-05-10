
import java.util.*;
public class removeduplicates{
    public static void removeduplicatesitems(String str,int idx,StringBuilder newstr,boolean map[])
    {
        // base
        if(idx==str.length())
        {
            System.out.print(newstr);
            return;
        }
        //kaam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true)
        {
            removeduplicatesitems(str,idx+1,newstr,map);
        }
        else{
            map[currchar-'a']=true;
            removeduplicatesitems(str,idx+1,newstr.append(currchar),map);
        }

    }
    public static void main(String args[] )
    {
        String str="apnacollege";
        removeduplicatesitems(str,0,new StringBuilder(""),new boolean[26]);
    }
}