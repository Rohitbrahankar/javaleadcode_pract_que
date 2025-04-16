package stack;

import java.util.Stack;

public class using_linkList {

   static  class Node{
       int data;
       Node next;
       Node(int data)
       {
           this.data=data;
          this.next=null;

       }
   }
     static class impl
    {
        static Node head= null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int x)
        {
            Node n= new Node(x);
            if(isEmpty())
            {
                head= n;
                return;
            }
            n.next = head;
            head=n;

        }
        public static int pop()
        {
            int top=head.data;
            head= head.next;
            return top;

        }
        public static int peek()
        {
            if(isEmpty())return -1;
            int top= head.data;
//            System.out.println("Peek element is :"+top);
            return top;
       }

    }
    public static void main(String[] args) {
       impl im= new impl();
       im.push(1);
       im.push(2);
       im.push(3);

       while (!im.isEmpty())
       {
           System.out.println(im.peek());
           im.pop();


       }


    }
}
