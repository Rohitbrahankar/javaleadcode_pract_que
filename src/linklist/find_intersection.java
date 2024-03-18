package linklist;

public class find_intersection {
    public void  findintersection(Node h1, Node h2) {
        Node temp1 = h1;
        Node temp2 = h2;
        int count1 = 0;
        int count2 = 0;
        int n;
        while (temp1 != null) {
            count1 = count1 + 1;
            temp1 = temp1.next;

        }

        while (temp2 != null) {
            count2 = count2 + 1;
            temp2 = temp2.next;

        }
        temp1 = h1;
        temp2 = h2;
        if (count1 >= count2) {
            n = count1 - count2;

            for (int i = 1; i <= n; i++) {
                temp1 = temp1.next;
            }
        } else {
            n = count2 - count1;
            for (int i = 1; i <= n; i++) {
                temp2 = temp2.next;
            }
        }
//        int c= count1-n;
//        for(int i=0;i<c;i++)
//        {
//            if(temp1==temp2)
//            {
//                System.out.println(temp1);
//            }
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        System.out.println(temp1.data);

return ;
    }

    public  void display(Node head)
    {
        Node temp= head;

        while (temp!= null)
        {

            System.out.print(" "+temp.data);
            temp= temp.next;
        }



    }
    public static  class Node
    {
        int data;
    Node next;
        Node(int data)
        {

            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3= new Node(30);
        Node n4= new Node(145);
        Node n5= new Node(70);
        Node n6= new Node(80);
        Node n7=new Node(90);
        Node n8= new Node(100);
        Node n9= new Node(110);
        n1.next= n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next= n7;
        n7.next=n8;
        n8.next= n9;
        Node p1= new Node(40);
        Node p2= new Node(300);
        Node p3= new Node(145);
        Node p4= new Node(70);
        Node p5= new Node(80);
        Node p6= new Node(90);
        Node p7= new Node(100);
        Node p8= new Node(110);
        n5.next = p5;
        p1.next= p2;
        p2.next=p3;
        p3.next=n4;
//        .next=p5;
//        p5.next=p6;
//        p6.next=p7;
//        p7.next=p8;
        find_intersection  f= new find_intersection();
        f.display(p1);
        System.out.println(" ");
      f.findintersection(n1,p1);
    }
}
