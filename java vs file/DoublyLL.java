
public class DoublyLL{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        //add first
        public void addFirst(int data)
        {
            Node newNode=new Node (data);
            size++;
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }

        //remove first
         public int removeFirst()
         {
            if(head==null)
            {
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
            }
            if(size==1)
            {
                int val=head.data;
                head=tail=null;
                size--;
                return val;
            }
            int val=head.data;
            head=head.next;
            head.prev=null;
            size--;
            return val;
         }
        // revese
        public void reverseDll()
        {
            Node curr=head;
            Node prev=null;
            Node next;
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                curr.prev=next;
                prev=curr;
                curr=next;
            }
            head=prev;
        }

        //print
        public void print()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");
        }


    public static void main (String [] args)
    {
         DoublyLL dll=new DoublyLL();
         dll.addFirst(3);
         dll.addFirst(2);
         dll.addFirst(1);
         dll.print();
          System.out.println(dll.size);
        // dll.removeFirst();
         //dll.print();
         //System.out.println(dll.size);
         dll.reverseDll();
         dll.print();


    }
 }
