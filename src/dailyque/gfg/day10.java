package dailyque.gfg;
/* Given two sorted arrays a[] and b[], where each array contains distinct elements , the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.*/
import java.util.*;

import static java.util.Arrays.*;

//union of two unsorteda array
public class day10 {
    public static void main(String[] args) {
        Integer arr1[]={1};
        Integer arr2[]={1,2,3,4};
        int i=0;
        int j=0;
        Set<Integer> ans= new TreeSet<>();
      for(int num1: arr1)
      {
          ans.add(num1);
      }
       for(Integer num:arr2)
       {
          ans.add(num);
       }

        System.out.println(ans);
    }
}
