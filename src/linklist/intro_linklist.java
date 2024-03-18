package linklist;



public class intro_linklist {


    public static void rev(Node n) {
        if (n==null) return;
        rev(n.next);
            System.out.print(n.data+" ");


    }


    public static class Node {
        int data;

        Node next;

        Node(int data) {
            this.data = data;

        }
    }

        public static void main(String[] args) {
            Node a = new Node(2);
            Node b = new Node(3);
            Node c = new Node(4);
            Node d = new Node(6);
            a.next = b;
            b.next = c;
            c.next = d;
            System.out.println(d.next);
            System.out.println(a.data);
            Node temp = a;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            rev(a);


        }
    }

