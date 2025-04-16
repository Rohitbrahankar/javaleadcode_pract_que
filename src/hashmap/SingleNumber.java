package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,99};
        Map<Integer ,Integer> hs= new HashMap<>();
        int n = args.length;
        for(int i : arr)
        {
            if(!hs.containsKey(i)){
                hs.put(i,1);
            }else {
                hs.put(i,hs.get(i)+1);
            }


        }
        System.out.println(hs.entrySet());
        int xor=0;
        int newq=0;
        for(int i :arr)
        {
//            if(hs.get(i)== 1)
//            {
//                System.out.println(i);
//            }
            xor=xor^i;
            newq=newq^xor;
            System.out.println(newq);


        }


    }
}
