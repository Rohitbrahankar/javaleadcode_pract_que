package linklist.basic;

import static java.lang.reflect.Array.get;

public class ll {


   private  Node head;//maintain head
   private  Node tail;//it remain the tail data
   private  int size ;
   public ll() {
       this. size=0;
    }
    /*-------------------------------------------------------------------*/
    //create node
    public  void inserstfirst(int val)
    {
        Node n= new Node(val);
        n.next=head;
        head= n;
        if(tail==null)
        {
            tail= head;
        }
        size++;
    }

/*-------------------------------------------------------------------*/
    public void insertend(int val)
    {
        Node node= new Node(val);
        if(tail==null)
        {
            inserstfirst(val);
           return;
        }
        tail.next=node;
        tail= node;
    }
    /*-------------------------------------------------------------------*/
    //insertat given index
    public void insertatindex(int  index,int val)
    {
        if(index==0)
        {
            inserstfirst(val);
        }
        if(index==size)
        {
            insertend(val);
        }
        Node temp= head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node= new Node(val,temp.next);
        temp.next=node;
        size++;

    }

    /*-------------------------------------------------------------------*/
    public  void  display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");

    }
    /*-------------------------------------------------------------------*/
    public  int  deletefirst()
    {

//        Node temp= head;
//        temp=temp.next;
//        head= temp;
        int val= head.val;
        head = head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return val ;
    }

    /*-------------------------------------------------------------------*/
    public  int  deletelast()
    {
        if(size<=1)return deletefirst();

        Node secondLast = get(size-2);
        int val= tail.val;
        secondLast.next=null;
        return  val;

    }
    /*-------------------------------------------------------------------*/
    public int deletAtindex(int index)
    {
        if(index==0)return  deletefirst();
        if(index==size-1)return  deletelast();

        Node prev= get(index-1);
        int val= prev.next.val;
        prev.next=prev.next.next;
        return  val;

    }
    /*-------------------------------------------------------------------*/
    public Node findnode(int val)
    {
        Node node=head;
        while(node!=null){
            if(node.val==val)
            {
                return  node;
            }
            node=node.next;
        }
        return  null;
    }
    /*-------------------------------------------------------------------*/
     public  Node get(int index)
     {
         Node node= head;
         for(int i=0;i<index;i++)
         {
             node=node.next;
         }
         return node;
     }
    /*-------------------------------------------------------------------*/
    //create node
    private  class Node{
        private  int val;
        private  Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
