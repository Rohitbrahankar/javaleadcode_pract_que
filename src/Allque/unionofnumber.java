package Allque;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class unionofnumber {
   static  void union(int arr1[],int arr2[],int n1,int n2)
   {
         int i =0 ,j=0;
       ArrayList<Integer> al= new ArrayList<>();
       int newn= n1+n2;
       for(i =0 ;i<n1;i++ )
       {
          j =i;
          if(arr1[i]==arr2[j])
          {
              al.add(arr1[i]);
          }else {


              if(!al.contains(arr1[i]))
              {
                  al.add(arr1[i]);
              }
              if(!al.contains(arr2[i]))
              {
                  al.add(arr2[j]);
              }


          }

       }
       for(i=0;i<al.size();i++)
       {
           System.out.println(al.get(i));
       }

   }

static  void usingset(int arr1[],int arr2[],int n1,int n2)
{
    Set<Integer> set = new HashSet<>();
    for(int i =0 ;i< n1;i++)
    {
        set.add(arr1[i]);
        set.add(arr2[i]);
    }
    System.out.println(set);
}
    public static void main(String[] args) {
        int arr1[]={-7 ,8};

        int arr2[]={-8 ,-3 ,8};
        int n1= arr1.length;
        System.out.println("len n1="+n1);
        int  n2= arr2.length;
        System.out.println("len n2="+n2);
       // union(arr1,arr2,n1,n2);
        usingset(arr1,arr2,n1,n2);
    }
}
