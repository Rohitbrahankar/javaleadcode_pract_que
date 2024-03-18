package linklist;
//delete the nth node from last
public  class nthnodedelet {//find n th element using the  two traversal
    public static Node  nthnode(Node head,int n)
    {
        int size =0;
       Node temp= head;
        while (temp!=null)
        {
              size++;
              temp=temp.next;

        }
        int m= size-n+1;
        temp=head;
        for(int i=0;i<m;i++)
        {
            temp=temp.next;
        }
        return  temp;

    }
    public static Node  nthnode2(Node head,int n){// use only one traversal

        Node fast=head;
        Node slow= head;
        for(int i=0;i<n;i++){
            fast= fast.next;
        }
        while (fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        if(fast==null)
        {
            head=head.next;
            slow=head;
        }

        return  slow;


    }
    public  static class  Node{
        int data;
       Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a= new Node(100);
        Node b= new Node(10);
        Node c= new Node(12);
        Node d= new Node(13);

a.next =b;
b.next=c;
c.next=d;

Node n=nthnode2(a,2);
        System.out.println(n.data);



    }
}
