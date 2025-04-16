package Array;

import java.util.*;

public class unionoftwoarray {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int arr2[]={1,2,3};
        Set<Integer> st= new HashSet<>();
        for(int i : arr)
        {
             st.add(i);
        }
        for(int i :arr2)
        {
             st.add(i);
        }
        int n = st.size();
        System.out.println( "Size of set is :"+ n);

    }
}
