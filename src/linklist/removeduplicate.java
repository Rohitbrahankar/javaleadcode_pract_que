package linklist;

public class removeduplicate {
    public class Node{
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

        // Function to remove duplicates from sorted linked list.
        Node removeDuplicates(Node head) {
            // Your code here
            Node temp = head;
            while(temp!=null && temp.next!=null)
            {

                int current=temp.data;
                int curnext=temp.next.data;
                if(current==curnext)
                {
                    temp.next=temp.next.next;
                }else{
                    temp=temp.next;
                }
            }
            return head;
        }






}
