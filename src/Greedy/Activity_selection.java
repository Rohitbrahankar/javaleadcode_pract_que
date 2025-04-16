package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Activity_selection {
    public static void main(String[] args) {
        int start[]={1, 3, 0, 5, 8, 5};
        int end[]={2, 4, 7,6, 5 , 9};

        int i =0;
        int activit[][]= new int[start.length][3];
  Arrays.sort(activit, Comparator.comparing(o->o[2]));
//        Arrays.sort(start);
        int n =start.length;
        int count=0;

        for(i=0;i< n-1;i++)
        {
            if(end[i]<= start[i+1])
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
