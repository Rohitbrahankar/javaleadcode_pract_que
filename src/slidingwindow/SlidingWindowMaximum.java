package slidingwindow;

import java.util.Arrays;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int arr[]={1};
        int k=1;
        int i=0,j=0,p,m=0;
        int n= arr.length;
       // int ans[]=new int[n];
        int max[]=new int[n - k + 1];
        int maxn=Integer.MIN_VALUE;
        while(j<n)
        {
           maxn=Math.max(maxn,arr[j]);

            if(j-i+1==k)
           {

               max[m]=maxn;
               m++;
               if (arr[i] == maxn) {

                   maxn = Integer.MIN_VALUE;
                   for ( p = i + 1; p <= j; p++) {
                       maxn = Math.max(maxn, arr[p]);
                   }
               }
               i++;

           }
           j++;
        }
        for(int x=0;x<max.length;x++)
        {
            System.out.println(max[x]);
        }

    }
}
