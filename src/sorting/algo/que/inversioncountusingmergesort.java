package sorting.algo.que;

public class inversioncountusingmergesort {
    static void display(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println(); // Added for better readability
    }

    static int merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                swaps += (n1 - i); // Increment swaps count
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }

        return swaps;
    }

    static int mergesort(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int mid = (l + r) / 2;

            count += mergesort(arr, l, mid);
            count += mergesort(arr, mid + 1, r);
            count += merge(arr, l, mid, r);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        int n = arr.length;
        display(arr);
        int inversionCount = mergesort(arr, 0, n - 1);
        display(arr); // Display sorted array
        System.out.println("Number of inversions: " + inversionCount);
    }
}
