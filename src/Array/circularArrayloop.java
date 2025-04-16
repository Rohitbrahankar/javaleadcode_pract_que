package Array;

public class circularArrayloop {
    public  static boolean findloop(int arr[])
    {

        int n= arr.length;
        for(int i=0 ;i< n-1;i++)
        {
            int fast =i ,slow = i;
           boolean isforward= arr[i ]> 0;
           while(true)
           {
               slow=getnext(arr, n , slow, isforward);
               if(slow==-1)break;

               fast= getnext(arr , n , fast,isforward);
               if(slow==-1)break;
               fast= getnext(arr , n , fast,isforward);
               if(slow==-1)break;
               if(slow==fast)return true;

           }


        }

        return false;
    }
    public static  int getnext(int arr[] , int n , int index,boolean isforward)
    {
        boolean direction= arr[index]>0;
        if(direction!= isforward)return -1;
        int next= (index+arr[index])%n;
        if(next<0)next+=n;
        if(next==index)return -1;
        return next;
    }
    public static void main(String[] args) {
        int arr[]={1,-1,5,1,4};

      boolean ans= findloop(arr);
        System.out.println(ans);
    }
}
