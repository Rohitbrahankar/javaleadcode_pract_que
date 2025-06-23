package linklist;



public class Reverse {
    static  class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data= data;

        }
    }

    Node head= null;
    Node tail=null;

    void insertAtend(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }
    void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node currentNode = head;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prev;

            prev = currentNode;
            currentNode = nextNode;
        }

        head = prev; 
    }

    void disply()
  {
      if(head==null)
      {
          return;
      }

      Node temp = head;
      while(temp!=null)
      {
          System.out.print(temp.data +"->");
          temp= temp.next;
      }
      System.out.print("NULL");

  }
    public static void main(String[] args) {
        Reverse r= new Reverse();

        r.insertAtend(1);
        r.insertAtend(2);
        r.insertAtend(3);
        r.insertAtend(4);
        r.insertAtend(5);
        r.disply();
        r.reverse();
        System.out.println(" \n ");
        r.disply();



    }

}
