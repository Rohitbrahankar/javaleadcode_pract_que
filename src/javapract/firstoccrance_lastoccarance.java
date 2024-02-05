//using binary search find the first occrance and last occrance of the element

package javapract;

public class firstoccrance_lastoccarance {

    public static int firstoccrance(int[] arr, int n, int key)
    {  int s,end ,mid;
        s=0;end=(n-s)-1;
        mid= (s+end)/2;
        int ans=-1;

        while (s<=end)
        {
            if(key==arr[mid])
            {
                ans=mid;
                end= mid-1;
            } else if (key>arr[mid]) {// search at right part
                s=mid+1;

            } else if (key<arr[mid]) {// search at left part
                end= mid-1;
            }
            mid= (s+end)/2;


        }
        return ans;
    }
    public static int lastoccrance(int[] arr, int n, int key)
    {  int s,end ,mid;
        s=0;end=(n-s)-1;
        mid= (s+end)/2;
        int ans=-1;

        while (s<=end)
        {
            if(key==arr[mid])
            {
                ans=mid;
                s= mid+1;
            } else if (key>arr[mid]) {
                s=mid+1;

            } else if (key<arr[mid]) {
                end= mid-1;
            }
            mid= (s+end)/2;


        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,2,5};
        int n= arr.length;
        int key =3;
        System.out.println("First occarance of elemnt 3  at   index :"+firstoccrance(arr, n,3));
        System.out.println("Last  occarance of elemnt 3  at   index :"+lastoccrance(arr, n,3));

    }
}


