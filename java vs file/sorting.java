import java.util.*;
public class sorting{


    public static void bubblesort(int arr[])
    { int n=arr.length;
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }




    public static void selectionsort(int arr[])
    { int n=arr.length;
        for(int i=0;i<n-1;i++)
        { int minpos=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                    
                }
            }
                    int temp=arr[minpos];
                    arr[minpos]=arr[i];
                    arr[i]=temp;
        }
    }



    public static void insertionsort(int arr[])
    { int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            //find the correct position
            while(prev>=0&&arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    } 


   


public static void countingsort(int arr[])
    { int n=arr.length;
      int largest=Integer.MIN_VALUE;
      for(int i=0;i<n;i++)
      {
        largest=Math.max(largest,arr[i]);
      }

      //frequency

     int count[]=new int[largest+1];
     for(int i=0;i<n;i++)
     {
        count[arr[i]]++;
     }

      //sorting
      int j=0;
      for(int i=0;i<count.length;i++)
      { 
        while(count[i]>0)
        {
            arr[j]=i;
            count[i]--;
            j++;
        }
      }

    }


 public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }



 public static void main(String args[])
    {
      int arr[]={1,4,1,3,2,4,3,7};
     // bubblesort(arr);
      //selectionsort(arr);
      countingsort(arr);
      printArray(arr);
    }
}