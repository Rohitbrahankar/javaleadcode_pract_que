package stack;

import java.net.Inet4Address;
import java.util.ArrayList;

public class stackimpl_ArrayList {
   public static  void isEmpty(ArrayList<Integer>arr)
   {
       if(arr.isEmpty())
       {
           System.out.println("stack is empty");
       }

   }
   public  static void push(ArrayList<Integer> arr , int x)
   {
       arr.add(x);
       System.out.println("Element  push succesfully ");
   }
   public static int pop(ArrayList<Integer>arr)
   {
       if(arr.isEmpty())
       {
           return -1;

       }
       int top= arr.get(arr.size()-1);
       arr.remove(arr.size()-1);
       return top;

   }
   public static void  peek(ArrayList<Integer>arr)
   {
       int top= arr.get(arr.size()-1);
       System.out.println("peek element is :"+top);
   }
    public static void main(String[] args) {
        ArrayList<Integer>al= new ArrayList<>();
        isEmpty(al);
        push(al,10);
        push(al,11);
        push(al,12);
        push(al,14);
        System.out.println( pop(al));
        peek(al);


    }
}
