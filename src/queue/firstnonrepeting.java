package queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class firstnonrepeting {
    public static void main(String[] args) {
        String  st="aabbacc";
        Queue<Character> q= new LinkedList<>();
        int freq[]= new int[26];
        for(int i =0;i< st.length();i++)
        {
            char ch = st.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            {
                 q.remove();
            }


        }
        if(q.isEmpty())
        {
            System.out.println(-1+"");
        }else{
            System.out.println(q.peek());
        }
        System.out.println(" ");


    }
}
