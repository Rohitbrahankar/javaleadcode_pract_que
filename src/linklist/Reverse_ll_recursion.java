package linklist;

public class Reverse_ll_recursion {
    static class Node{
        int data;
        Node next = null;
        Node(int data)
        {
            this.data= data;
        }
    }
    Node  head= null;
    Node tail=null;

    void insterNode(int data)
    {
         Node newNode = new Node(data);
         if(head==null)
         {
             head= newNode;
             tail= head;

         }else{
             tail.next=newNode;
             tail=newNode;
         }


    }

    void display()
    {
         if(head==null)
         {
              return ;
         }

         Node temp = head;
         while(temp != null)
         {
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
    }


    Node reverse(Node head)
    {
         if(head==null || head.next==null)
         {
             return  head ;
         }


        Node rest= reverse(head.next);

         head.next.next= head;
         head.next=null;


         return rest;

    }





    public static void main(String[] args) {
       Reverse_ll_recursion pp= new Reverse_ll_recursion();
        pp.insterNode(1);
        pp.insterNode(2);
        pp.insterNode(3);
        pp.insterNode(4);
        pp.insterNode(5);
        pp.display();
//        Node head= new Node(-1);

        pp.head=  pp.reverse(pp.head);
        System.out.println(" ");
        pp.display();


    }

}



