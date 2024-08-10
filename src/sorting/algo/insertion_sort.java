package sorting.algo;

public class insertion_sort {
    public  static  void insertion_sort(int arr[])
    {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            int j =i;
            while(j>0 && arr[j]<arr[j-1])//
            {
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;

            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,7,3,9,4,1};
        insertion_sort(arr);
        for(int i :arr)
        {
            System.out.println( i +" ");
        }

    }
}
