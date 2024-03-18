package linklist;
//find mid element
public class findmid {
    public static void findmid(Node n1)
    {
        Node  slow= n1;//head
        Node fast = n1;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        System.out.println(slow.data);



    }
    public static  class Node
    {
        int data;
        findmid.Node next;
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
         findmid(n1);
        //System.out.println(n);
        //System.out.println(n1.data);


    }
}
