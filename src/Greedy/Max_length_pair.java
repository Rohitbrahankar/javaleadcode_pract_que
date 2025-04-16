package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Max_length_pair {
    public static void main(String[] args) {
        int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        int total=1;
        int n = arr.length;
//        int ans[][]= new int[n][1];
//        //0->start, 1 -> end
//        for(int i =0;i< n;i++)
//        {
//            ans[i][0]=a
//        }
        Arrays.sort(arr, Comparator.comparingDouble(o->o[1])); //sort


        int last= arr[0][1];
        for(int i=1;i< n;i++)
        {
            if(arr[i][0] > last)
            {
                total++;
                last= arr[i][1];
            }
        }
        System.out.println("total pair :"+total);
    }
}
