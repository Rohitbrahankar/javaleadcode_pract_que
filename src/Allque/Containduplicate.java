package Allque;

import java.util.HashMap;
import java.util.Map;

public class Containduplicate {
    static  boolean containduplicate(int arr[])
    {
        Map<Integer ,Integer> map= new HashMap<>();
        for(int i =0 ;i< arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                return true;
            } map.put(arr[i],1);

        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        boolean ans=containduplicate(arr);
        System.out.println(ans);
    }
}
