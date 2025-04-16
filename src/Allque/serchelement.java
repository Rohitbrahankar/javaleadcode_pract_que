package Allque;

import java.util.HashMap;

public class serchelement {
    static int searchInSorted(int arr[], int N, int K) {
        int m = N /2;
        if(arr[m]< K)
        {
            int  i ;
            for(i = m+1;i<N ;i++)
            {
                if( arr[i]==K)
                {
                    return 1;
                }
            }
        }
        else
        {
            int  i=0;
            for(i = 0;i<m-1 ;i++)
            {
                if( arr[i]==K)
                {
                    return 1;
                }
            }
        }
        return -1;


        // Your code here
    }

    public static void main(String[] args) {
        int arr[]={3,0,1};
        int N = 5, K = 7;
       // System.out.println(searchInSorted(arr,N,K));
        //int nu[]= new int[n];

    }
}
