package sorting.algo;

public class mergesort {
    static void displayarr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Added newline for better readability
    }

    static void merger(int arr[], int l, int r) {
        int mid = (l + r) / 2;
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Corrected the population of left array
        for (int i = 0; i < n1; i++) left[i] = arr[l + i];

        // Corrected the population of right array
        for (int j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;

        // Merge the left and right arrays back into arr
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements of left
        while (i < n1) arr[k++] = left[i++];

        // Copy any remaining elements of right
        while (j < n2) arr[k++] = right[j++];

    }

    public static void merger_sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        merger_sort(arr, l, mid); // sort left half
        merger_sort(arr, mid + 1, r); // sort right half
        merger(arr, l, r); // merge sorted halves
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 5, 6, 7, 0, 2};
        int n = arr.length;
        System.out.println("array before sorting:");
        displayarr(arr);
        merger_sort(arr, 0, n - 1); // Corrected end index to n - 1
        System.out.println("array after sorting:");
        displayarr(arr);
    }
}
