package hashmap;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class freqofnumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,3,5,6,3,8,5,4};
        Map<Integer ,Integer> mp = new HashMap<>();
        int N = arr.length;
        for(int i :arr)
        {
            if(!mp.containsKey(i)) {
                mp.put(i, 1);
            }else {
                mp.put(i,mp.get(i)+1);
            }
        }

        for(int i = 1; i <= N; i++){
            arr[i - 1] = mp.containsKey(i) ? mp.get(i) : 0;
        }
        System.out.println(mp.entrySet());

        System.out.println();
       // mp.values()
    }
}
