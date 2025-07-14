
// reverse linked list
public class Reversell{
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

    // reverse
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev; // reverse step
            prev=curr;
            curr=next;

        }
        head=prev;

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
    Reversell ll=new Reversell();
    
    ll.addFirst(2);
    
    ll.addFirst(1);
    
    ll.addLast(4);
    
    ll.addLast(5);
    ll.addIndex(2,3);

    ll.print();
    // System.out.println(ll.size);
    ll.reverse();
    ll.print();
    

 } 
    
}