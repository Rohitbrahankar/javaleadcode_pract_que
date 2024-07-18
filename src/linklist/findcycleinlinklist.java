package linklist;

public class findcycleinlinklist {
    public  static  boolean findcycle(Node n1)
    {
        Node head= n1;
        Node fast= head;
        Node slow= head;
        while(fast!=null)
        {
            if (head==null)
            {
                return false;
            }
            if (head.next==null)
            {
                return false;
            }
            if(slow.next==null)
            {
                return false;
            }
            slow= slow.next;
            if(fast.next==null)
            {
                return false;
            }
            fast = fast.next.next;

           if(fast==slow )
           {
               return true ;
           }

        }
        return false;
    }
    public  static class Node
    {
        int data;
       findcycleinlinklist.Node next;
        Node(int data)
        {

            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node n1= new Node(10);
       Node n2= new Node(19);
        Node n3= new Node(100);
        Node n4= new Node(18);
       Node n5= new Node(103);
        Node n6= new Node(140);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n4;
       boolean n= findcycle(n1);
       if(n==true)
       {
           System.out.println("form a cycle ");
       }
       else
           System.out.println("not ");
    }
}
