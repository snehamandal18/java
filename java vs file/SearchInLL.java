
// Searching
public class SearchInLL{
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
 // addition from first
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
    // addition from last
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
    // addition in middle index
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

    // iterative search
    public int itrSearch(int key)
    {
        Node temp= head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;//key found
            }
            temp=temp.next;
            i++;
        }
        return -1; // key not found
    }
   // print ll
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

    // recursive search
    public int helper(Node head, int key )
    {
        if(head==null)
        {
            return -1;

        }
        if(head.data==key)
        {
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1)
        {
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key)
    {
        return helper(head,key);
    }
 public static void main(String args[])
 {
    SearchInLL ll=new SearchInLL();
    
    ll.addFirst(2);
    
    ll.addFirst(1);
    
    ll.addLast(4);
    
    ll.addLast(5);
    ll.addIndex(2,3);

    ll.print();
    // System.out.println(ll.size);
    //System.out.println(ll.itrSearch(3));
    //System.out.println(ll.itrSearch(10));
    System.out.println(ll.recSearch(3));
    System.out.println(ll.recSearch(10));
    

 } 
    
}