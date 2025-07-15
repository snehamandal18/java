

// linked list pallindrome or not
public class PallindromeLL{
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

    // find mid using slow fast method
    public Node findMid(Node head)
    {
        Node slow=head ;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2

        }
        return slow; // slow is the mid node
    }

    // pallindrome ll
    public boolean checkPallindrome()
    {  
        if(head==null||head.next==null)
        {
            return true;
        }
        // step1-find mid
        Node midNode=findMid(head);


        //step2-reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; // right half head
        Node left =head;

        //step3-check left half & right half
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right = right.next;

        }
        return true;

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
    PallindromeLL ll=new PallindromeLL();
    
    
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(2);
    ll.addLast(1);
    ll.print();// 1->2->2->1->
    System.out.println(ll.checkPallindrome());
   
   
    

 } 
    
}