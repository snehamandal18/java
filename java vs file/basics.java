import java.util.*;
public class basics{
    public static void main(String args[])
    {
        //sum of 2 numbers
        /*
        int a=10;
        int b=5;
        int sum=a+b;
        System.out.println (sum);
        */


       Scanner sc = new Scanner (System.in);
      // String input=sc.next();
      // System.out.println(input);
      //String name=sc.nextLine();
      //System.out.println(name);
       //int number=sc.nextInt();
       //System.out.println(number);


 //sum of 2 numbers using user ip
    /* int a= sc.nextInt();
     int b=sc.nextInt();
     System.out.println(a+b);*/


     // product
    /* int a= sc.nextInt();
     int b=sc.nextInt();
     System.out.println(a*b);*/


     //area of circle
    /* float r= sc.nextFloat();
     System.out.println(3.14*r*r);*/


     //type casting
     /*float b=25.99f;
     int a=(int)b;
     System.out.println(a);*/


    /* char c='a';
     int number=c;
     System.out.println(number);*/


     //type promotion
    /* char c='a';
     char d='b';
     System.out.println(d-c);*/


    // int $=24;
    // System.out.println($);

     // odd even
    /* int a=sc.nextInt();
     if(a%2==0)
     {
        System.out.println("even");
     }
     else{
        System.out.println("odd");
     }
     */
    // income tax
/*
    int x=sc.nextInt();
    if(x<500000)
    {
        System.out.println("tax=0");
    }
    else if(x>=500000 && x<1000000)
    {
        System.out.println("tax="+0.2*x);
    }
    else{
        System.out.println("tax="+0.3*x);
    }
    }
    */

   // largest among three 
   /*
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   if(a>b && a>c)
   {
    System.out.println(a +" is the largest");
   } 
   else if (b>a && b>c)
   {
    System.out.println(b +" is the largest");
   }
   else{
    System.out.println(c +" is the largest");
   }*/



  // calculator
  /*
  System.out.println(" enter a:");
   int a=sc.nextInt();
   System.out.println(" enter b:");
   int b=sc.nextInt();
   System.out.println(" enter operator:");
   char operator=sc.next().charAt(0);
   switch(operator)
   {
    case '+':System.out.println(" addition:"+(a+b)); break;
    case '-':System.out.println(" subtraction:"+(a-b)); break;
    case '*':System.out.println(" multiplication:"+(a*b)); break;
    case '/':System.out.println(" division:"+(a/b)); break;
    case '%':System.out.println(" modulo:"+(a%b)); break;
    default :System.out.println(" wrong input "); 
   }
   */


  //while loop
 // /*
  int counter=0;
  while(counter<10)
  {
    System.out.println("motu");
    counter++;
  } System.out.println("printed 10x");
  //*/
 // print 1to n
 /*
 System.out.println("enter the n:");
 int n=sc.nextInt();
 int count=1;
 while(count<=n)
 {
    System.out.print(count+" ");
    count++;
 }*/



// sum of n numbers
/*
 System.out.println("enter the n:");
 int n=sc.nextInt();
 int i=0;
 int sum=0;
 while(i<=n)
 {
    sum+=i;
    i++;
 }
 System.out.println("sum of n numbers is :"+sum);*/
 // square pattern
 /*
 System.out.println("enter the n:");
 int n=sc.nextInt();
 for(int i=0;i<n;i++ )
 {
    System.out.println("****");
 } */




 // reverse digit print
 /*
 System.out.println("enter the number:");
 int n=sc.nextInt();
 while(n>0)
 {
   int lastdigit=n%10;
   System.out.print(lastdigit);
   n=n/10;
 }*/




 // reverse a number
/*
 System.out.println("enter the number:");
 int n=sc.nextInt();
 int rev=0;
 while(n>0)
 {
   int ld=n%10;
   rev=(rev*10)+ld;
   n=n/10;
 } 
 System.out.print(rev);
 */



// continue statement
/*
do
{
   System.out.print("enter the number:");
   int n=sc.nextInt();
   if(n%10==0)
   {
      break;
   }
   System.out.println(n);
   
  } while(true);
  */



 // prime or not
 /*
 System.out.print("enter the number:");
   int n=sc.nextInt();
   if(n==2)
   {
      System.out.println("prime number");
   }
   else{
   boolean isPrime=true;
   for(int i=2;i<=Math.sqrt(n);i++)
   {
      if(n%i==0)
      {
         isPrime=false;
      }
   }
   if(isPrime==true)
   {
      System.out.println("prime number");
   }
   else{
      System.out.println("not prime");
   }
   }
   */




  // pattern1
  /*
System.out.println("enter the n:");
   int n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
      for(int j=1;j<=i;j++)
      {
         System.out.print("*");
      }
      System.out.println();
   }
  */

 
// pattern2
/*
System.out.println("enter the n:");
   int n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
      for(int j=1;j<=n-i+1;j++)
      {
         System.out.print("*");
      }
      System.out.println();
   }
   */



  //pattern 3
  /*
System.out.println("enter the n:");
   int n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
      for(int j=1;j<=i;j++)
      {
         System.out.print(j);
      }
      System.out.println();
   }
*/

//pattern 4
/*
System.out.println("enter the n:");
   int n=sc.nextInt();
   char ch='A';
   for(int i=1;i<=n;i++)
   {
      for(int j=1;j<=i;j++)
      {
         System.out.print(ch);
         ch++;
      }
      System.out.println();
   }*/
 }
}