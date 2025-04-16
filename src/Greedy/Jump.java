//package Greedy;
//
//public class Jump {
//    public  boolean jump(int arr[])
//    {
//         int n = arr.length;
//         if(n==1)return true;
//         int idx=0;
//         for(int i =0 ;i< n;i++)
//         {
//             if(arr[i]!=0)
//             {
//                 return false;
//             }
//
//             if(idx+arr[i] !=n  )
//             {
//                   i= idx+arr[i];
//                   if(arr[i]==0)
//                   {
//                       return false;
//                   }
//
//             }
//             if(idx+arr[i] > n)
//             {
//                 return true;
//             }
//         }
//    }
//    public static void main(String[] args) {
//        int arr[]={};
//
//    }
//}
