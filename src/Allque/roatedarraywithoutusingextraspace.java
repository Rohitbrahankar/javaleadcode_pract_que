package Allque;

public class roatedarraywithoutusingextraspace {
     static  void  swap(int arr[], int  i ,int j)
     {
         int temp= arr[i];
         arr[i]=arr[j];
         arr[j]=arr[i];
     }
    static  void reverse(int arr[] , int i , int j )
    {
        while (i< j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static  void roatedk(int arr[] , int k ) {
         int n = arr.length;
         k= k%n;
         reverse(arr, 0,n-1);
        // print(arr);
        System.out.println("------------");
         reverse(arr,0, k-1);
        //print(arr);
        System.out.println("------------");
         reverse(arr,k,n-1);
       // print(arr);
        System.out.println("------------");



    }
    static  void  print(int arr[] )
    {
        for(int i :arr)
        {
            System.out.println(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k = 3;
        print(arr);
        System.out.println("----------------");
        roatedk(arr, k);
    print(arr);



    }
}


