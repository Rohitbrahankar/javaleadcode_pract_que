package Allque;

import java.util.HashSet;

public class subarraywithequalsum {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,0,0,0,0};
        int n = arr.length;
        int k = 2;
        int i = 0, j = 0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        while (j < n) {
            sum += arr[j]; // Add current element to sum

            // Check if window size is k
            if (j - i + 1 == k) {
                // If the sum is already in the set, it means we've found a repeated sum
                if (set.contains(sum)) {
                    System.out.println("true");
                    return; // Exit early, as we found the answer
                } else {
                    set.add(sum); // Add the current sum to the set
                }

                // Move the window: subtract the element at index i
                sum -= arr[i];
                i++; // Slide the window
            }

            j++; // Expand the window
        }

        // If no repeated sum was found
        System.out.println("false");
    }
}
