package Greedy.Top50;

import java.util.PriorityQueue;

public class Connect_n_ropes {
    public static void main(String[] args) {
        int arr[]={10};
        int mincost=0;
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        for(int i :arr)
        {
            pq.add(i);
        }
        while (pq.size() > 1)
        {
            int firstel= pq.poll();
            int secondel= pq.poll();
            int sum= firstel+secondel;
            mincost+=sum;
            pq.add(sum);
        }
        System.out.println(mincost);
    }
}
