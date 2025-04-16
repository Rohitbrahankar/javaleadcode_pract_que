package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class heap_impl {
    public static void addel(ArrayList<Integer> al, int data) {
        al.add(data);
        int x = al.size() - 1; // Child index
        int par = (x - 1) / 2; // Parent index

        while (x > 0 && al.get(x) < al.get(par)) {  // Min-Heap property
            Collections.swap(al, x, par);
            x = par;
            par = (x - 1) / 2;
        }
    }

    public static void buildMinHeap(ArrayList<Integer> al) {
        int n = al.size();
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(al, i, n);
        }
    }

    private static void heapify(ArrayList<Integer> al, int i, int n) {
        int minidx = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && al.get(left) < al.get(minidx)) { // Min-Heap Fix: Check if left is smaller
            minidx = left;
        }
        if (right < n && al.get(right) < al.get(minidx)) { // Min-Heap Fix: Check if right is smaller
            minidx = right;
        }

        if (minidx != i) { // Swap only if needed
            Collections.swap(al, i, minidx);
            heapify(al, minidx, n);
        }
    }

    public static void main(String[] args) {
        Integer arr[] = {2, 3, 4, 5, 6, 10};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));

        buildMinHeap(al); // Build Min-Heap
        int data = 1;
        addel(al, data); // Insert new element

        System.out.println(al); // Print the Min-Heap
    }
}
