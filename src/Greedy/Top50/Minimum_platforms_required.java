package Greedy.Top50;

import java.util.Arrays;

public class Minimum_platforms_required {
    public static void main(String[] args) {
        int arr[]={900, 940, 950, 1100, 1500, 1800};
        int depr[]={910, 1200, 1120, 1130, 1900, 2000};
        Arrays.sort(arr);
        Arrays.sort(depr);
        int platform=1;
        int count=0;

        int i =0,  j =0; // i =arr , j = depar
        int n = arr.length;

        while(i < n)
        {
             if(arr[i] <= depr[j])
             {
                 count++;
                 platform= Math.max(platform , count);
                 i++;
             }else if(arr[i] > depr[j]){
                 count--;
                 j++;
             }
        }

        System.out.println("Min platform :"+platform);




    }
}
