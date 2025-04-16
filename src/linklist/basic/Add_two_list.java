package linklist.basic;

public class Add_two_list {
    private Add_two_list.Node head; // Head of the linked list
    private Add_two_list.Node tail; // Tail of the linked list
    private int size;

    public Add_two_list() {
        this.size = 0;
    }

    // Method to insert a value into the linked list
    public void insert(int val) {
        Node node = new Node(val);

        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }


    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }

    // Inner Node class
    private class Node {
        private int val;
        private Add_two_list.Node next;

        public Node(int val) {
            this.val = val;
        }
    }



}
