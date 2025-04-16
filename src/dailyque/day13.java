package dailyque;

import static java.lang.Math.ceil;

public class day13 {
    public static void main(String[] args) {
        int arr[] = {1, 10, 3, 3, 3};
        int n = arr.length;
        int sum = 0;
        int j = 0;
        int t = 3;

        while (j < t) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;


            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }


            sum += max;


            if (maxIndex != -1) {

                arr[maxIndex] = (int) ceil(arr[maxIndex] / 3.0);
            }

            j++;
        }

        System.out.println("Sum of maximums: " + sum);
    }
}
