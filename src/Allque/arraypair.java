import java.util.HashMap;

public class arraypair {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int mid = n / 2;  // Correct midpoint calculation

        // Initialize arrays for the two halves
        int arr1[] = new int[mid];
        int arr2[] = new int[n - mid];  // Adjust for possible uneven length

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Fill the first half
        for (int i = 0; i < mid; i++) {
            arr1[i] = arr[i];
        }

        // Fill the second half
        for (int i = mid; i < n; i++) {
            arr2[i - mid] = arr[i];  // Adjust index
        }

        // Check pairs for sum divisible by 5
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int sum = arr1[i] + arr2[j];
                if (sum % 10== 0) {
                    hm.put(i, j);  // Store indices of the valid pairs
                }
            }
        }

        // Print the valid pairs as (arr1[i], arr2[j])
   if(hm!=null)
   {
       System.out.println("false");
   }else System.out.println("true");
//        for (Integer key : hm.keySet()) {
//            Integer value = hm.get(key);
//
//            System.out.println("(" + arr1[key] + ", " + arr2[value] + ")");
//        }
    }

}
