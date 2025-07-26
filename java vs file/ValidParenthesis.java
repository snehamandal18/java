
import java.util.*;
public class ValidParenthesis{

  //valid parenthesis
  public static boolean isValidParenthesis(String str)
  {
    Stack <Character> s=new Stack<>();
    for(int i=0;i<str.length();i++)
    {  char ch=str.charAt(i);
       
        //opening bracket
        if(ch=='('||ch=='{'||ch=='[')
        {
            s.push(ch);
        }
        //closing bracket
        else{
            if(s.isEmpty())   //)}] for all closingbracket
            {
                return false;
            }
            //pair check
            if(  (s.peek()=='(' && ch==')') 
                 || (s.peek()=='{' && ch=='}')
                || (s.peek()=='[' && ch==']')   )
               {
                  s.pop();
               }
             else{
                return false;
             }  
            

        }

    }
    if(s.isEmpty()){ return true; }
    else { return false;}
  }
    public static void main (String args[])
    {
        String str="(){}[(]";
        System.out.println(isValidParenthesis(str));
    }
}