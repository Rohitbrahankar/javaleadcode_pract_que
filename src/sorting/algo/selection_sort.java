package sorting.algo;

public class selection_sort {
    public  static  void  selctionsort(int arr[])
    {
        int n= arr.length;
        for( int i =0 ; i < n-1 ;i++)
        {   int minimum= i;
            for(int j = i+1 ; j< n;j++)
            {
                if(arr[j] < arr[minimum])
                {
                     minimum= j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[minimum];
            arr[minimum]= temp;

        }


    }
    public static void main(String[] args) {
        int arr[]={7,5, 4, 1, 3};
        selctionsort(arr);
        for (int i : arr)
        {
            System.out.println(  i+ " ");
        }
    }
}
