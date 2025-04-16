package Allque;

import java.util.HashMap;
import java.util.Map;

public class majorityofelement {
    public static void main(String[] args) {
        int arr[]= {4,4,2,4,3,4,4,3,2,4};
        HashMap<Integer,Integer> hashMap= new HashMap<>();
       int n = arr.length;

        for(int i=0;i<n;i++)
        {
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            }else {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }


        }
        System.out.println(hashMap.entrySet());
       // int s= hashMap.size();
        for(Map.Entry<Integer,Integer>entry:hashMap.entrySet())
        {
            if(entry.getValue() > n)
            {
                System.out.println( entry.getKey());
            }

        }


    }
}
