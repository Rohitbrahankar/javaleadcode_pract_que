package Allque;

import java.util.HashMap;

public class Majority_element {
    public static void main(String[] args) {
        int arr[]={5 ,6 ,5, 6, 5, 6, 5, 6, 5, 5, 5, 5, 5};
        int n=arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        int num=arr[0];
        if(n==1 && arr[0]>0)
        {
            System.out.println(arr[0]);
            return;
        }
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=0, maxele=0;
        for(int i=0;i<n;i++){

           max=Math.max(max,map.get(arr[i]));
            System.out.println("max :"+max);
           if(arr[i]==max)
           {
               maxele=arr[i];
               System.out.println("maxele"+maxele);
           }

        }
        if(max>(n/2))
        {
            System.out.println("element:"+maxele);
        }else {
            System.out.println(-1);
        }


    }
}
