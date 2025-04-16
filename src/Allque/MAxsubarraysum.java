package Allque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAxsubarraysum {
    static  int subarraysum(List<Integer>arr)
    {
        int maxi= arr.get(0);
        int sum=0 ;
        int n = arr.size();
       int st=-1;
       int en=-1;

int ansst = -1;
        for(int i=0;i<n ;i++)
        {
            if(sum ==0) st=i;

            sum += arr.get(i);
            if(maxi < sum )
            {
                maxi = sum;
               ansst = st; en=i;
            }
            if(sum < 0)
            {
                sum = 0;
            }

        }
        System.out.println(ansst +" "+en);

        return maxi;
    }
    public static void main(String[] args) {
        int arr[]= {-1};
        List<Integer> arr1= new ArrayList<>(Arrays.asList(4, 3, 1, 5, 6));





        int n = subarraysum(arr1);
        System.out.println("Max sum from array :"+n);
    }
}
