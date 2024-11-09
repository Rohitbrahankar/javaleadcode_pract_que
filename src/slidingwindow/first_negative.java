package slidingwindow;

import java.util.ArrayList;

public class first_negative {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int n = arr.length;
        int i = 0, j = 0;


        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        while (j < n) {

            if (arr[j] < 0) {
                negatives.add(arr[j]);
            }


            if (j - i + 1 == k) {

                if (!negatives.isEmpty()) {
                    ans.add(negatives.get(0));
                } else {
                    ans.add(0);
                }


                if (!negatives.isEmpty() && negatives.get(0) == arr[i]) {
                    negatives.remove(0);
                }

                i++;
            }
            j++;
        }


        for (Integer m : ans) {
            System.out.print(m + " ");
        }
    }
}
