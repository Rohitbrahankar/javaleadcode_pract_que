package Array;
/*Given an array arr. Find the majority element in the array. If no majority exists, return -1.

A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.*/
import java.util.HashMap;
import java.util.Map;

public class Mejorityelement {
    public static void main(String[] args) {
        int arr[]={3,13};
        HashMap<Integer ,Integer> map= new HashMap<>();
        int n= arr.length;
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> hm:map.entrySet())
        {
            int key= hm.getKey();
            int value= hm.getValue();
           if(value > n/2)
           {
               System.out.println( "ans :"+key);
               return;
           }
        }
        System.out.println(-1);
    }
}
