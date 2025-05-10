import java.util.*;
public class stringbasics{

    public static void printchar(String str)
    {
           for(int i=0;i<str.length();i++)
           {
            System.out.println(i+"="+str.charAt(i));
           }
    } 

    public static boolean pallindrome(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            { //not pallindrome
                return false;
            }
            
        }
        return true;
    }

    public static float getshortestpath(String path)
     {
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            if(dir=='S')
            {
                y--;
            }
            else if(dir=='N')
            {
               y++;
            }
             else if(dir=='E')
            {
               x++;
            }
            else
            {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
     }

     
    public static void main(String args[])
    {
       //Scanner sc=new Scanner(System.in);
      // String fullname=sc.nextLine();
       //System.out.println(fullname);

       // length
      // System.out.println(fullname.length());

      // string concatination
      /*
      String firstname="Sneha";
      String lastname = "Mandal";
      String Fullname=firstname+" "+lastname;
      System.out.println(Fullname);
      */

     //printchar(fullname);
     //String path="WNEENESENNN";
     String path="NS";

     System.out.println(getshortestpath(path));
    }
} 