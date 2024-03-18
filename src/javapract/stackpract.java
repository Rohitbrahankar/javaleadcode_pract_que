package javapract;

import java.util.Stack;

public class stackpract {
    public static void main(String[] args) {
        Stack sc= new Stack();
        sc.push("hello");
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push (3);
        sc.push("rohit");
        sc.push(6);
        sc.push(8);
        System.out.println(sc.peek());
        System.out.println(sc);
        if (sc.empty()) {
            System.out.println("empty stack");
        }else {
            System.out.println( sc.pop());
        }

    }
}
