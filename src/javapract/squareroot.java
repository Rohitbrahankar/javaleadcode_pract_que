//find square root of any number with log(n) complexity

package javapract;

public class squareroot {
    public static  int squreroot(int n, int[] arr)
    {
        int s=0;int end=n-1;
        int mid,and;
        mid=s+end/2;
       while(s>mid)
       {
           if (arr[mid*mid]>n)
           {
               end= mid-1;
           } else if (arr[mid*mid]<n) {
               int ans= mid;
               s=mid+1;
           }
           else if(arr[mid*mid]==n)
           {
               return mid;

           }

       }
       return 0;
    }
    public static void main(String[] args) {
        int n=4;
        int arr[] = new int [n];
        System.out.println(squreroot(n, arr));


    }
}
