package dailyque.gfg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day20 {
    public static void main(String[] args) {
        int nums[]={1, 2, 3, 4, 5};
        List<Integer>ans= new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n= nums.length;
        int cond= n/3;
        for(Map.Entry<Integer,Integer> mapele:map.entrySet())
        {
            int p=mapele.getValue();
            //System.out.println(p);

            if(cond<p)
            {
                ans.add(mapele.getKey());
            }else {
                System.out.println(ans);
                return;
            }
        }
        System.out.println(ans);
    }
}
