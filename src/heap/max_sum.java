package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class max_sum {
    public static void main(String[] args) {
        int arr1[]={};
        int arr2[]={};

        PriorityQueue<Integer> pq1= new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2= new PriorityQueue<>(Collections.reverseOrder());
        for(int i :arr1)
        {
            pq1.add(i);
        }
        for(int i :arr2)
        {
            pq2.add(i);
        }
        int max=0;
        int i =0;
        while(pq1.size()>=1)
        {
            int maxel= pq1.peek() > pq2.peek()? pq1.peek() : pq2.peek();
            
        }

    }
}
