package linklist;



    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class Deleting_last_occurance {
        public static Node deleteLastOccurrence(Node head, int key) {
            if (head == null) return null;

            int pos = 0;
            int lastPos = -1;
            Node temp = head;

            // First pass: Find position of last occurrence
            while (temp != null) {
                if (temp.data == key) {
                    lastPos = pos;
                }
                temp = temp.next;
                pos++;
            }

            // If key not found
            if (lastPos == -1) return head;

            // If head needs to be removed
            if (lastPos == 0) {
                return head.next;
            }

            // Second pass: Traverse to node before last occurrence
            temp = head;
            for (int i = 0; i < lastPos - 1; i++) {
                temp = temp.next;
            }

            // Delete the last occurrence
            if (temp.next != null) {
                temp.next = temp.next.next;
            }

            return head;
        }

        // Utility method to print list
        public static void print(Node head) {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(2);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(2);

            int key = 2;
            print(head);
            head = deleteLastOccurrence(head, key);
            print(head);
        }
    }

