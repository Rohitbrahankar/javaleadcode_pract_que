package dailyque;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class day19 {
    public static void main(String[] args) {
        int arr[]={4,4,4};
        int k=3;
        int i=0,j=0;
        int n= arr.length;
        int sum=0,maxresult=0;
        HashSet<Integer> li= new HashSet<>();
        while(j<n){

            if(li.add(arr[j]))
            {
                sum+=arr[j];
            }else{
                while(arr[i]!=arr[j])
                {
                    sum-=arr[i];
                    li.remove(arr[i]);
                    i++;
                }
                i++;
            }


            if(j-i+1==k)
            {
                maxresult=Math.max(maxresult,sum);
                sum-=arr[i];
                li.remove(arr[i]);
                i++;
            }
            j++;


        }
        System.out.println("Maximum result is :"+maxresult);
    }
}
