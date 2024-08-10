package Allque;
//roated array k time using extra space
public class roatedarray {
    static  int[] roatedk(int arr[],int k )
    {
        int n = arr.length;
        int [] ans = new  int[n];
        System.out.println(n);
         k = k % n;
        System.out.println(k);

         int j =0;
        for(int i =n-k-1;i < n-1;i++)
        {
            ans[j++]= arr[i];
        }
        for(int i = 0 ;i < n-k-1 ;i++)
        {
            ans[j++]= arr[i];
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k = 3;
        for(int i : arr)
        {
            System.out.println(i+" ");
        }
        System.out.println("----------------");
     int ans[]=   roatedk(arr, k);
        for(int i : ans)
        {
            System.out.println(i+" ");
        }

    }
}
