package linklist.basic;

public class ll_implementation {
    public static class Node {
        int data;

        Node next;

        Node(int data) {
            this.data = data;

        }
    }
    public static   class  linklist
    {
        Node head= null;
        Node tail=null;
        void insertAtend(int val)
        {
            Node temp= new Node(val);

            if(head==null)
            {
                head=temp;
                tail= temp;
            }
            else {
                tail.next = temp;
                tail=temp;
            }


        }
        void  display()
        {
            Node temp= head;
            if(head==null) return;

            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }

        }
        void   dis()
        {
            Node temp= head;

            if(head==null) return;

            System.out.print(temp.data+"");


        }
        void size()
        {
            Node temp= head;
            int count=0;
            while(temp!=null)
            {  if(head==null)
                return;
                else {
                count = count + 1;

            }

               temp=temp.next;
            }
            System.out.println(count);
           
        }
        void insertatbeg(int val )
        {
            Node temp= new Node(val);
            if(head==null)
            {
                insertAtend(val);
            }else {
                temp.next = head;
                head = temp;
            }

        }
        void intsertat(int pos,int val)
        {
            Node newnode= new  Node(val);
            Node temp=head;

            if(pos==0)
            {
                insertatbeg(val);
            }
            for(int i=0;i<pos-1;i++)
            {
                 temp= temp.next;
            }

            newnode.next=temp.next;
            temp.next=newnode;


        }


    }
    public static void main(String[] args) {
       linklist ll= new linklist();

        ll.insertAtend(12);
        ll.insertAtend(13);
        ll.insertAtend(15);
        ll.insertAtend(17);
        ll.insertAtend(178);


        ll.display();
        System.out.println( );
        ll.size();
       ll. intsertat(2,30);
       ll.display();
        System.out.println( );
       ll.insertatbeg(300);
        ll.display();
    }
}
