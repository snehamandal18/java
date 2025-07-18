
public class ZigzagLL{
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
    public void addLast(int data)
    {
        //create a node
        Node newNode=new Node(data);
        
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
    
    public void zigZag()
    {
        // find mid
         Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid= slow;
        //reverse 2nd half
        Node curr=mid.next;
         mid.next=null;
        Node prev=null;
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
        Node nextL,nextR;

        //alternative merge
        while(left!=null && right!=null)
        {  //zigzag
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            //update
            left=nextL;
            right=nextR;
        }
    }
    public static void main(String args[])
 {
    ZigzagLL ll=new ZigzagLL();
    
    ll.addLast(1);
    
    ll.addLast(2);
    
    ll.addLast(3);
    
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    

    ll.print();
    ll.zigZag();
    ll.print();

 } 

}