// Addition and Deletion
public class LinkedList1{
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;

        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {  // step1--create a new node 
        Node newNode = new Node(data);
        size++;
        // base condition
        if(head==null)
        {
            head=tail=newNode;
            return ;
        }
        //link
        newNode.next=head;
        //update head
        head=newNode;

    }
    public void addLast(int data)
    {
        //create a node
        Node newNode=new Node(data);
        size++;
        // base condition
        if(head==null)
        {
            head=tail=newNode;
            return ;
        }
        // link
        tail.next=newNode;

        // update
        tail=newNode;

    }

    public  void addIndex(int idx, int data)
    {  
        
        if(idx==0)
        {
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        // when i=idx-1 , temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // remove from first
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("empty linkedlist");
            return Integer.MIN_VALUE;

        }

        else if(size==1)
        {
            int val = head.data;
            head=head.next;
            size=0;
            return val;
        }

        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    // remove from last
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("empty linkedlist");
            return Integer.MIN_VALUE;

        }
        else if (size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        Node prev=head;
        //prev:i=size-2
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        // when prev=size-2
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    // remove n th node from last
    public void DeleteNthFromEnd(int n)
    {
       // calculate size
       int sz=0;
       Node temp=head;
       while(temp!=null)
       {
        temp=temp.next;
        sz++;
       }
       // remove first
       if(sz==n)
       {
        head=head.next;
        return;
       }
       //nth node from start=sz-n+1
       // prev=sz-n
       int i=1;
       int iToFind=sz-n;
       Node prev=head;
       while(i< iToFind)
       {
        prev=prev.next;
        i++;
       }
       prev.next=prev.next.next;
       return;

    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("ll is empty");
            return;
        }
        Node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next; 

        }
        System.out.println("null");
    }
 public static void main(String args[])
 {
    LinkedList1 ll=new LinkedList1();
    
    ll.addFirst(2);
    
    ll.addFirst(1);
    
    ll.addLast(4);
    
    ll.addLast(5);
    ll.addIndex(2,3);

    ll.print();
    // System.out.println(ll.size);
    //ll.removeFirst();
    //ll.print();
   // ll.removeLast();
   ll.DeleteNthFromEnd(3);
    ll.print();
    //System.out.println(ll.size);

 } 
    
}