package Array;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class K_Sized_Subarray_Maximum {
    public static void main(String[] args) {
       int arr[]={1, 2, 3, 1, 4, 5, 2, 3, 6};
       //3, 3,4 , 5 ,5, 6
       int k=3;

        ArrayList<Integer> al = new ArrayList<>();
       // PriorityQueue<Integer> pq= new PriorityQueue<>();


        int i =0 , j=0;
        int n = arr.length;
        int maxel=0;

        while (j < n) {
            maxel = Math.max(maxel, arr[j]);

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                al.add(maxel);
                if (arr[i] == maxel) {
                    maxel = Integer.MIN_VALUE;
                    for (int x = i + 1; x <= j; x++) {
                        maxel = Math.max(maxel, arr[x]);
                    }
                }
                i++;
                j++;
            }
        }

        System.out.println(al);
    }
}
