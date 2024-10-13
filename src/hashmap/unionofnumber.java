package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class unionofnumber {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3,6};
        int len= arr1.length+ arr2.length;
        HashSet<Integer> mp= new HashSet<>();
        HashSet<Long> m= new HashSet<>();

        for(int i=0 ;i<arr1.length;i++)
        {
            mp.add(arr1[i]);
        }
        int j=0;
        for(int i = arr1.length; i<len; i++)
        {
            mp.add(arr2[j]);
            j++;
        }
        System.out.println(mp);
        System.out.println(mp.size());



    }
}
