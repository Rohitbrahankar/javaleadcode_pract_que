package sorting.algo;

import java.util.Arrays;

import static java.lang.Math.max;

public class countsort {
    static  int []  countsort(int arr[])
    {
        int n = arr.length;
        int k= arr[0];
        for( int i =0 ;i<n-1 ;i++)// use to  find the maxinmun element from the array
        {
            k = max(arr[i],k);

        }
        System.out.println(k);
        int count []= new int [k+1];
        for(int i=0 ;i<n ;i++)//create the freq array
        {
            System.out.println( count[arr[i]]++);

        }


        for( int i=1 ; i<=k ; i++)
        {
            count[i]+=count[i-1];
        }


        int output[] = new int[n];
        for(int i=n-1 ; i >= 0 ;i--)
        {
            output[--count[arr[i]]]= arr[i];
        }

        for(int i=0 ;i < n-1 ;i++)//create the freq array
        {
            arr[i]=output[i];

        }
        return  output;




    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,1,2,4,4,5};
        countsort(arr);
//        for(int i :arr)
//        {
//            System.out.println(i+" ");
//        }
    }
}
