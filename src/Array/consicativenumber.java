package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class consicativenumber {
    public static void main(String[] args) {
        int arr[]={99, 80, 60, 33, 44, 86, 34, 64, 77, 18, 39, 3 ,
                27, 16, 29, 60, 67, 23, 7, 87, 6 ,75, 92, 11, 59, 13,
                88, 24, 98, 4, 26, 6};
        Arrays.sort(arr);

        int k=arr[0];
        Set<Integer>st= new HashSet<>();
        for (int num : arr) {
            st.add(num);
        }

        int count=0;
        for(int num : st)
        {
            if(!st.contains(num-1))
            {
                int curr=num;
                int strik=1;
                while(st.contains(curr+1))
                {
                    curr++;
                    strik++;
                }
                count= Math.max(count,strik);
            }
        }
        System.out.println(count);

    }
}
