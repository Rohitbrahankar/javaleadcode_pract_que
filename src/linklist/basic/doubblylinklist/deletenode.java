package linklist.basic.doubblylinklist;

public class deletenode {
    Node head;
    public void delete(int p){
        Node  temp= head;
        if(head!=null && p==1)
        {
            head= head.next;
            head.prev=null;

        }
        for(int i=0;i<p;i++)
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            temp.prev.next=null;
            temp.prev=null;
        }
        temp.prev.next=temp.next;
        temp.prev.prev=temp.prev;



    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
