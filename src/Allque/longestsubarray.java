package Allque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class longestsubarray {
  static void subarray(int a[],int sum)
   {
       int cursum=0;
       int st=0;
       int end=-1;
       int lon=0;
       List<Integer> li= new ArrayList<>();
       HashMap<Integer,Integer>has= new HashMap<>();
       for(int i =0 ;i<a.length;i++)
       {
           cursum+=a[i];
           if(cursum-sum ==0)
           {
               st=0;end=i;
               break;
           }
           if(has.containsKey(cursum-sum))
           {
               st=has.get(cursum-sum)+1;


               end= i ;
               int culon=(end-st)+1;
               if(lon < culon)
               {
                   lon = culon;

               }

           }
           has.put(cursum,i);
       }
     if(end ==-1)
     {
         System.out.println("not found");
     }
     else
     {
         System.out.println(st+" "+end);
         System.out.println("long size"+lon);
     }
   }


    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        subarray(arr,15);
    }
}


