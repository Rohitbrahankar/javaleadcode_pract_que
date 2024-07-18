package linklist;

public class findwherecyclebegin {
    public  Node findcycle (Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {

            slow= slow.next;

            fast=fast.next.next;
            if(slow==fast)
            {
                System.out.println("cycle found succesfully ");
                Node temp=head;
                int  cout=0;

                 while (temp!=slow)
                {
                    temp=temp.next;
                    slow=slow.next;

                }
                return slow;
                //System.out.println(slow.data);


            }
        }
       return  null;

    }


public  static  class Node
{
    int data;
    findwherecyclebegin.Node next ;
     Node (int data ){
         this.data=data;
     }
}

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(80);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(70);
        Node n7= new Node(100);
        Node n8 = new Node(110);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n3;

       findwherecyclebegin f= new findwherecyclebegin();
      Node m= f.findcycle(n1);
        System.out.println(m.data);
        




    }

}


