package sorting.algo;

public class quecksort {
    static  void  display(int arr[])
    {
        for(int i : arr)
        {
            System.out.println(i+" ");
        }
    }
    static  void  swap(int arr[], int x ,int y){
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static  int partion(int arr[] ,int st,int end )
    {
        int pivot = arr[st];
        int cnt=0;
        for(int i= st+1; i<= end ;i++){
            if(arr[i] < pivot) cnt++;
        }
        int pivIndex= st + cnt;
        swap(arr,st,pivIndex);
        int i= st, j= end;
        while (i < pivIndex && j > pivIndex)
        {
            while (arr[i]<= pivot)i++;
            while (arr[j]> pivot)j--;
            if(i <pivIndex && j > pivIndex)
            {
                swap(arr,i,j );
                i++;
                j--;

            }

        }
             return  pivIndex;
    }
    static  void  queck_sort(int arr[], int st ,int end ) {
        if (st >= end) return;
        int piv = partion(arr, st, end);
        queck_sort(arr, st, piv - 1);
        queck_sort(arr, piv + 1, end);


    }

    public static void main(String[] args) {
        int []arr= {9,2,6,10,1,4,56,78};
        int n= arr.length;
        display(arr);
        queck_sort(arr,0,n-1);

        display(arr);

    }
}
