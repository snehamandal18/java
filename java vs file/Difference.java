import java.util.Scanner;
public class Difference {
 
 public static void main(String[] args) {
  // Create a Scanner object to read input from the user
  Scanner sc = new Scanner(System.in);
   
  int A = sc.nextInt();
  int B=sc.nextInt();
  int C = sc.nextInt();
  int D = sc.nextInt();
  int x=A*B;
  int y=C*D;
  System.out.println(" Difference" + " = " + (x - y));
  
 }
}