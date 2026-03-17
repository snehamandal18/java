import java.util.*;
public class Insertion {
    public static int[] insertBegin(int arr[], int k)
    {
                int [] newArr = new int[arr.length+1];
                newArr[0] = k;
                for(int i=1 ; i < newArr.length ; i++)
                {
                   newArr[i] = arr[i-1];
                }
            return newArr;   
    }
    public static int[] insertEnd(int arr[], int k)
    {
             int [] newArr = new int[arr.length+1];
                
                for(int i=0 ; i < newArr.length-1 ; i++)
                {
                   newArr[i] = arr[i];
                }   
                newArr[newArr.length-1] = k;
           return newArr;     
    }
    public static int[] insertPos(int arr[] , int pos , int k)
    {
         int [] newArr = new int[arr.length+1];
         for(int i=0 ; i<pos ; i++)
            {
                newArr[i] = arr[i];
            }  
            newArr[pos] = k;
         for(int i=pos+1 ; i<newArr.length ; i++)
            {
                newArr[i] = arr[i-1];
            }  
            return newArr;       
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,3,4,5};
        int x = 1;
        int y = 6;
        int z = 8;
        int pos = 3;
        int newArr[]=insertBegin(arr, x);
        for(int num : newArr)
        {
            System.out.print(num+" ");
        }
        System.err.println();
        int newArr1[] = insertEnd(newArr, y);
        for(int num : newArr1)
        {
            System.out.print(num+" ");
        }
        System.err.println();
        int newArr2[]=insertPos(newArr1,pos,z);
        for(int num : newArr2)
        {
            System.out.print(num+" ");
        }
        System.err.println();



    }
}
