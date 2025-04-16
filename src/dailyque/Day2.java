import java.util.Arrays;
import java.util.HashMap;

public class Day2 {
    public static void main(String[] args) {
        int arr[] = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        int n = arr.length;
        int clone[] = arr.clone();

        Arrays.sort(clone);

        HashMap<Integer, Integer> hm = new HashMap<>();
        int rank = 1;  // Start ranking from 1

        // Assign ranks to each unique element in the sorted array
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(clone[i])) {
                hm.put(clone[i], rank);
                rank++;
            }
        }

        // Print the rank of each element from the original array
        for (int i = 0; i < n; i++) {
            System.out.print(hm.get(arr[i]) + " ");
        }
    }
}
