
import java.util.*;
public class recursionbasics{
   // linear search
    public static void decending(int n)
    { if(n==1)
      {
        System.out.print(n);
        return;
      }
      
       System.out.print(n+" ");
       decending(n-1);
       
    }
       public static void asscending(int n)
    { if(n==1)
      {
        System.out.print(n+" ");
        return;
      }
      
       
       asscending(n-1);
       System.out.print(n+" ");
       
    }
    public static int factorial(int n)

    { 
      if(n==1)
      {
        
        return 1;
      }
      int fnm1=factorial(n-1);
      int fn = n*factorial(n-1);
      return fn;
       
    }
    public static int sumofn(int n)

    { 
      if(n==1)
      {
        
        return 1;
      }
      int snm1=sumofn(n-1);
      int sn = n+snm1;
      return sn;
       
    }
    public static boolean isSorted(int arr[],int i)

    { 
      if(i==arr.length-1)
      {
        
        return true;
      }
      if(arr[i]>arr[i+1])
      {
        return false;
      }
      return isSorted(arr,i+1);
       
    }
    public static int firstoccurance(int arr[],int key,int i)

    { 
      if(i==arr.length)
      {
        
        return -1;
      }
      if(arr[i]==key)
      {
        return i;
      }
      return firstoccurance(arr,key,i+1);
       
    }
    public static int lastoccurance(int arr[],int key,int i)

    { 
      if(i==arr.length)
      {
        return -1;
      }
      int isFound=lastoccurance(arr,key,i+1);
      if(isFound==-1 && arr[i]==key)
      {
        return i;
      }
      return isFound;
       
    }
    public static int pow(int x,int n)

    { 
      if(n==0)
      {
        
        return 1;
      }
     
      
      return x*pow(x,n-1);
       
    }

 public static int optimizedpow(int a,int n)

    { 
      if(n==0)
      {
        
        return 1;
      }
      int halfpow= optimizedpow(a,n/2);
      int halfpowsq= halfpow*halfpow;
      if(n%2!=0)
      {
        return a*halfpowsq;
      }
     
      
      return halfpowsq;
       
    }
    public static void main(String args[])
    {
      //int n=5;
     // decending(n);
    // asscending(n);
     //System.out.println(factorial(n));
      //System.out.println(sumofn(n));
      int arr[]={8,3,6,9,5,10,2,5,3};
       //System.out.println(isSorted(arr,0));
       //System.out.println(firstoccurance(arr,7,0));
      //System.out.println(firstoccurance(arr,7,0));
      System.out.println(optimizedpow(2,5));

    }

}