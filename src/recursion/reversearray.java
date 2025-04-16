package recursion;


public class reversearray {
    static void swap(int arr[], int st, int en) {
        int temp = arr[st];
        arr[st] = arr[en];
        arr[en] = temp;
    }

    static void reverse(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        swap(arr, s, e - 1);
        reverse(arr, s + 1, e - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7, 9};
        int l = 0;
        int e = arr.length;

        reverse(arr, l, e);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
