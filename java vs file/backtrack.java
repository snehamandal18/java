
import java.util.*;
public class backtrack{
    public static void changeArray(int arr[],int i, int val)
    {
        // base case
        if(i==arr.length)
        {
            printarr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArray(arr,i+1,val+1);
        //backrack
        arr[i]=arr[i]-2;
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++) 
        {
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }

    // subset
    public static void findSubset(String str, String ans, int i)
    {
        //base case
         if(i==str.length())
         {
         if(ans.length()==0)
         {
            System.out.println("null");
         }
         else
         {
          System.out.println(ans);
         
         }
          return;
         }
        // yes choise
           findSubset(str,ans+str.charAt(i),i+1);

        //no choise
            findSubset(str,ans,i+1);

    }

    //find permutation
    public static void findpermutation(String str, String ans)
    {
        // basecase
        if(str.length()==0)
        {
            System.out.println(ans);
            return;

        }
        // recursion
        for(int i=0;i<str.length();i++)
        {
            char curr=str. charAt(i);
            //remove current char from string
            // abcde=>"ab"+"de"
            String newstr=str.substring(0,i)+str.substring(i+1);
            findpermutation(newstr,ans+curr);
        }
    }

    public static void main(String args[])
    {  /*
      int arr[]=new int[5];
      changeArray(arr,0,1);
      printarr(arr);*/
      //subset
      /*
      String str="abc";
      findSubset(str,"",0);
      */
     //permutation
     String str="abcd";
     findpermutation(str,"");

    }
}