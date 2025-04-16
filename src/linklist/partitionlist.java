package linklist;

import java.util.LinkedList;

public class partitionlist {
    public  static  void  partion(LinkedList<Integer> l,int x)
    {
        LinkedList<Integer> small = new LinkedList<>();
        LinkedList<Integer> large= new LinkedList<>();
        LinkedList<Integer> ans= new LinkedList<>();
       for(int i=0;i<l.size() ;i++)
        {
             int num= l.get(i);
             if(num < x)
             {
                 small.push(num);
             }else{
                 large.push(num);
             }
        }
       for(int i=0;i< small.size() ;i++)
       {
            ans.push( small.get(i));
       }
        for(int i=0;i< large.size() ;i++)
        {
            ans.push( large.get(i));
        }
        for(int i =0 ;i< l.size() ;i++)
        {
            System.out.println(ans.get(i));
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(5);
        ll.add(2);
        int x= 3;
        partion(ll,x);


    }
}
