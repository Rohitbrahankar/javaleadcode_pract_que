package Array;
public class sort_array_in_wave {
    public static void main(String[] args) {
        int arr[]={10, 5, 6, 2, 20, 100, 80};
        int n = arr.length;
        for(int i =1 ;i< n-2 ;i+=2)
        {
            if(arr[i-1]>=arr[i])
            {
                if(arr[i]<=arr[i+1])
                {
                    continue;
                }else{
                    int temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }else{
                int temp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i : arr)
        {
            System.out.println(i);
        }
    }

}



