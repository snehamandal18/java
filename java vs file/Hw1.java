import java.util.*;
public class Hw1{
    public static void main (String args[])
    {  //avg of 3 numbers
    /*
          int a=10,b=35,c=20;
          float avg=(a+b+c)/3;
          System.out.println(avg);
         */

        // area of a square

        Scanner sc=new Scanner(System.in);
       /* int side=sc.nextInt();
        int area=side*side;
        System.out.println(area);
       */

      //bill
       /*float pencil=sc.nextFloat();
       float pen=sc.nextFloat();
       float eraser=sc.nextFloat();
       float total=pencil+pen+eraser;
        System.out.println("total bill="+total);
        System.out.println("total bill with GST="+((0.18*total)+total));*/

        // largest among two numbers
        /*
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("largest");
        }
        else
        {
            System.out.println("smallest");
        }
       */
      // positive & negative 
      /*
      System.out.println("enter the number:");
      int num = sc.nextInt();
      if(num>0)
      {
        System.out.println("the number is positive");
      }
      else if(num<0)
      {
        System.out.println("the number is negative");
      }
      else{
        System.out.println("its zero");
      }
      */
     // temperature 
     /*
     System.out.println("enter the temperature:");
     double temp=sc.nextDouble();
     if(temp>100)
     {
        System.out.println("fever");
     }
     else{
        System.out.println("not fever");
     }
     */
    // print week using there number
    System.out.println("enter the number:");
    int number = sc.nextInt();
    switch(number)
    {
        case 1: System.out.println("Monday"); break;
        case 2: System.out.println("Tuesday"); break;
        case 3: System.out.println("wednesday"); break;
        case 4: System.out.println("Thrusday"); break;
        case 5: System.out.println("Friday"); break;
        case 6: System.out.println("Saturday"); break;
        case 7: System.out.println("Sunday"); break;
        default:System.out.println("wrong input"); break;

    }
    }
}