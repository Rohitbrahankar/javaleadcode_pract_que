// find the peak

package javapract;

public class peak_index_ofmountainarray {
    public static  int peekindex( int arr[],int n )
    {
        int s=0,e=n-1;
        int mid=(s+e)/2;
        while(s<e)
        {
            if(arr[mid]<arr[mid+1])
            {
                 s=mid+1;

            }
            else {
                e=mid;
            }
            mid=(s+e)/2;
        }
        return s;

    }

    public static void main(String[] args) {
        int arr[]={3,4,5,6,1};
        int n= arr.length;
        System.out.println(peekindex( arr,n ));


    }
}
