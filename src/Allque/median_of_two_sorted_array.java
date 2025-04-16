package Allque;

public class median_of_two_sorted_array {
    public static float merge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[n + m];
        int k = 0;
        int i = 0, j = 0;


        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }


        while (i < n) {
            ans[k] = arr1[i];
            i++;
            k++;
        }


        while (j < m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }


        int p = ans.length;
        if (p % 2 == 0) {
            // Even number of elements,
            return (float) (ans[p / 2] + ans[(p / 2) - 1]) / 2;
        } else {

            return ans[p / 2];
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2};
        int arr2[] = {3, 4};
        float ans = merge(arr1, arr2);


        System.out.print("Median: " + ans);
    }
}
