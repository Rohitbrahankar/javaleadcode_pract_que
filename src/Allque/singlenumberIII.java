package Allque;

import java.util.HashMap;
import java.util.Map;

/*260
 Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice.
 Find the two elements that appear only once. You can return the answer in any order.
You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
*/
public class singlenumberIII {
    public static void main(String[] args) {
        int arr[]={0,1};
        int n= arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans[]= new  int[n];
        map.put(0,0);
        for(int i:arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }else{
                map.put(i,1);
            }
        }
        int k=0;
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            int  key = mapElement.getKey();
            int value = mapElement.getValue() ;
             if(value==1)
             {
                 ans[k]=key;
                 k++;
             }


        }

    }
}
