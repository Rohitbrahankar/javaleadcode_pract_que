package Greedy.Top50;

import java.util.Arrays;

public class find_Minimum_number_of_Coins {
    public static void main(String[] args) {
        int n =39;
        int  arr[]={1, 2, 5, 10};
        Arrays.sort(arr);
        int m = arr.length-1;
        int mincoin=0;

        while( n> 0 &&  m >=0 )
        {
            if(arr[m] > n)
            {
                m--;
                continue;
            }
            mincoin+= n / arr[m];
            n= n % arr[m];
            m--;
        }
        System.out.println("minimum number of coin req : "+mincoin);
    }
}
