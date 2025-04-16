package Allque;

public class rearrangearray {
    static  void rearrange(int arr[],int n )
    {
        int ans []= new int[n];
        int neg=1;int pos=0;
        for(int i =0 ;i<n ;i++)
        {
            if(arr[i]<0)
            {
                ans[neg]= arr[i];
                neg+=2;
            }else {
                ans[pos]= arr[i];
                pos+=2;
            }
        }
        for(int i =0 ;i< n;i++)
        {
            System.out.println(ans[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]= {3,1,-2,-5,2,-4};
        int n = arr.length; ;
        rearrange(arr,n);
    }
}
