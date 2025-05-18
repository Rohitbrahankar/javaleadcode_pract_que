package gfg160;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class secondlargerst {

    public static void main(String[] args) {
        TreeSet<Integer> hm = new TreeSet<>(Collections.reverseOrder());
        int arr[] = {29646, 14713, 7843, 3153, 27830, 3182, 29439, 5327, 31431, 17107, 10309, 31971, 30490, 19313, 17383, 32456, 4939, 12419, 2566, 26028, 26399, 32456, 6197, 19811, 361, 8919, 7552, 2653, 46, 12467, 21421,
                19925, 29703, 18847, 7617, 23116};

        for (int i : arr) {
            hm.add(i);
        }

        if (hm.size() < 2) {
            System.out.println(-1);
            return ;


        }
        int largest = hm.first();
        

        Integer secondLargest = hm.lower(largest);

        if (secondLargest == null) {
            System.out.println("Second Largest Element: -1");
            return;
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }


    }
}
