
public class QueueUsingLL{

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;

        // empty cond
        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        //add----O(n)
        public static void add(int data)
        {
            Node newNode = new Node(data);
            // first element insertion
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            // for other cases
            tail.next=newNode;
            tail=newNode;

        }

        //remove---O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }
            int front=head.data;
            //last element deletion
            if(head==tail)
            {
                head=tail=null;
            }
            else{
            head=head.next;
            }
            return front;
        }

        //peek
        public static int peek()
        {
         if(isEmpty())
         {
           System.out.println("empty");
            return -1;
         }
          return head.data;

        }
    } 

    public static void main(String args[])
    {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}