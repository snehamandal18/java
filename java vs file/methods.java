import java.util.*;
public class methods{
    public static int calculatesum(int num1,int num2)
    {
          int sum=num1+num2;
          return sum;
    }


    public static int multiply(int num1,int num2)
    {
        int product=num1*num2;
        return product;
    }



    public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }


    public static int bincoeff(int n,int r)
    {
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int bicoff=fact_n/(fact_r*fact_nmr);
        return bicoff;
    }


    public static boolean isPrime(int n)
    {
      if(n==2)
      {
        return true;
      }
      for(int i=2;i<=Math.sqrt(n);i++)
      {
        if(n%i==0)
         {
          return false;
         }
      } 
      return true;
    }


    public static void primeinrange(int n)
    {
      for(int i=2;i<=n-1;i++)
      {
        if(isPrime(i))//true
        {
          System.out.print(i+" ");
        }
      }
      System.out.println();
    }
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
        // sum
      /*
      System.out.println("enter a:");
      int a=sc.nextInt();
      System.out.println("enter b:");
      int b=sc.nextInt();
     int sum=calculatesum(a,b);
      System.out.println("the sum of a&b is :"+sum);*/
    


    // 
    /*
     System.out.println("enter a:");
      int a=sc.nextInt();
      System.out.println("enter b:");
      int b=sc.nextInt();
      int prod=multiply(a,b);
      System.out.println("product is:"+prod);
      */


     // factorial
     /*
      System.out.println("enter n:");
      int n=sc.nextInt();
      System.out.println("enter r:");
      int r=sc.nextInt();
      System.out.println("binomialcoeff of n and r is:"+bincoeff(n,r));
    */


   // is prime
   /*
     System.out.println("enter n:");
      int n=sc.nextInt();
      System.out.println(isPrime(n));
      */



     // prime in range
    System.out.println("enter n:");
      int n=sc.nextInt();
      primeinrange(n);

    }
}
