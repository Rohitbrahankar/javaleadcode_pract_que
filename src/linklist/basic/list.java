package linklist.basic;

import linklist.basic.Add_two_list;

public class list {
    public static void main(String[] args) {
        int num = 807; // Number to be broken into digits
        int newn = 0;
        Add_two_list al = new Add_two_list(); // Create an instance of the linked list

        // Extract digits from the number and insert into the linked list
        while (num != 0) {
            newn = num % 10;  // Get the last digit
            num = num / 10;    // Remove the last digit from the number
            al.insert(newn);   // Insert the digit into the linked list
        }
        al.display();
    }
}
