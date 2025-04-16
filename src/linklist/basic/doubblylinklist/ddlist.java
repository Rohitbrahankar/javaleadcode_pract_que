package linklist.basic.doubblylinklist;

public class ddlist {
    Node head;
    public  void  insertfirst(int val)
    {
         Node node= new Node(val);
         node.next=head;
         node.prev=null;
         if(head!=null)
         {
             head.prev=node;
         }
         head=node;
    }
    /*-----------------------------------------------------------------------*/

     public  void  insertlast(int val)
     {
         Node node = new Node(val);
         Node last =head;
         if(head==null)
         {
             node.prev=null;
             head=node;
             return;
         }
         while(last.next!=null)
         {
             last=last.next;
         }
         last.next=node;
         node.prev=last;
         node.next=null;
     }
    /*-----------------------------------------------------------------------*/

     public  int deletefirst(){
         Node node=head;

         if(head!=null && node.prev==null)
         {
             head= head.next;
             head.prev=null;

         }
         return node.val;
         
     }
    /*-----------------------------------------------------------------------*/
    public  void display() {
        Node node=head;
        Node last=null;
        while (node!=null){
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
        }
        System.out.print("end");
        System.out.println("\nPrint in reverse");
        while (last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.print("start");

    }
    /*-----------------------------------------------------------------------*/
    public  void insertatgivenindex(int val,int index)
    {
        Node node= new Node(val);
        Node temp= head;
        for(int i=0;i<index;i++)//3
        {
            temp= temp.next;
        }

        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        if(node.next!=null)
        {
            node.next.prev=node;
        }


    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
