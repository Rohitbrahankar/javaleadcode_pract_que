package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class k_largest {
    public static void main(String[] args) {
        int k=4;
        int arr[]={1, 2, 3, 4, 5, 6};
        int n= arr.length;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        int i=0;
        int j =0;
        while(j< n)
        {
            if(j-i+1==k)
            {

                ans[j]=pq.poll();
                i++;
            }
            pq.add(arr[j]);
            j++;
        }
        for(int q:ans)
        {
            System.out.println(q);
        }
    }
}
