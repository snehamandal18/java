
import java .util.*;
public class RverseQueue{

    public static void reverse(Queue<Integer>q)
    {
        Stack<Integer> s= new Stack<>();
        //adding element into stack
        while(! q.isEmpty())
        {
            s.push(q.remove());
        }
        //removig element from stack
         while(! s.isEmpty())
        {
            q.add(s.pop());
        }

        

    }
    public static void main(String args[])
    {
       Queue<Integer> q= new LinkedList<>();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       
       reverse(q);
       while(! q.isEmpty())
       {
        System.out.print(q.remove()+" ");
       }
       System.out.println();

    }
}