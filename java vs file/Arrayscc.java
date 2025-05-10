import java.util.*;
public class Arrayscc{
   // linear search
    public static int linearSerach(int nums[],int key)
    {
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==key)
        {
            return i;
        }
      }
      return -1;
    }

    //largest of an array

    public static int getLargest(int nums[])
    {
      int largest = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++)
      {
        if(largest<nums[i])
         largest=nums[i];
      }
      return largest;
    }

    //binary search
    public static int binarySerach(int nums[],int key)
    {
      int start=0;
      int end=nums.length-1;
      while(start<=end)
      {
        int mid=(start+end)/2;
        if(key==nums[mid])
        {
          return mid;
        }
        if(key<nums[mid])
        {
          end=mid-1;
        }
        else{
          start=mid+1;
        }
      }
      return -1;
    }

    public static void reverseArray(int nums[])
    {
      int start=0;
      int end=nums.length-1;
      while(start<end)
      {
        //swap
        int temp;
        temp=nums[end];
        nums[end]=nums[start];
        nums[start]=temp;
        start++;
        end--;
      }
    }
  

  public static void pairArray(int nums[])
  {
    for(int i=0;i<nums.length;i++)
    {
      int curr=nums[i];
      for(int j=i+1;j<nums.length;j++)
      {
        System.out.print("("+curr+","+nums[j]+")");
      }
      System.out.println(" ");

    }
  }

  //printsubarray
  public static void subArray(int nums[])
  {
    for(int i=0;i<nums.length;i++)
    {
      int start=i;
      for(int j=i;j<nums.length;j++)
      {
         for(int k=start;k<=j;k++)
         {
           System.out.print(nums[k]+" ");
         }
        System.out.println(" ");
      }
      System.out.println(" ");
    }
    
  }
   public static void maxsubArraysum(int nums[])
  { int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++)
    {
      int start=i;
      for(int j=i;j<nums.length;j++)
      {  currsum=0;
         for(int k=start;k<=j;k++)
         {
           currsum+=nums[k];
         }
        System.out.println(currsum);
        if(maxsum<currsum)
         {
          maxsum=currsum;
         }
      } 
      
    } System.out.println("maximum sum:"+maxsum);
    
  }
  public static void maxsubArraysumII(int nums[])
  { int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    int prefix[]=new int[nums.length];

    //prefixsum
    prefix[0]=nums[0];
    for(int i=1;i<prefix.length;i++)
    {
      prefix[i]=prefix[i-1]+nums[i];
    }

    // currentsum
    for(int i=0;i<nums.length;i++)
    {
      int start=i;
      for(int j=i;j<nums.length;j++)
      { 
        int end=j;
        currsum= start==0?prefix[end]:prefix[end]-prefix[start-1];
        if(maxsum<currsum)
         {
          maxsum=currsum;
         }
      } 
      
    } 
    System.out.println("maximum sum:"+maxsum);
  } 

public static void kadanes(int nums[])
{
  int ms=Integer.MIN_VALUE;
  int cs=0;
  for(int i=0;i<nums.length;i++)
  {
    cs=cs+nums[i];
    if(cs<0)
    {
      cs=0;
    }
    ms=Math.max(ms,cs);
  }
  System.out.println("maximum sub array sum is:"+ms);
}


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       // int nums[]={2,20,13,10,16};
       // int key=10;
        //linear search
        /*int index=linearSerach(nums,key);
        if(index==-1)
        {
             System.out.println("not exist");
        }
        else{
             System.out.println("index is:"+index);
        }
       */
      // largest number
      /*
      int maximum=getLargest(nums);
      System.out.println("the largest no is: "+maximum);
      */
     //binary search
     /*
     int nums[]={2,4,6,8,10,12,14,16};
     int key=10;
     System.out.println("the index is:"+binarySerach(nums,key));
    */
   // reverse array
   /*
   int nums[]={2,4,6,8,10};
   reverseArray(nums);
    for(int i=0;i<nums.length;i++)
    {
      System.out.print(nums[i]+" ");
    }
    
    
    */
    //pairs
    /*int nums[]={2,4,6,8,10};
    pairArray(nums);
    */
   int nums[]={-2,-3,4,-1,-2,1,5,-3};
   // maxsubArraysum(nums);

   //maxsubArraysumII(nums);

   kadanes(nums);

  }
}
