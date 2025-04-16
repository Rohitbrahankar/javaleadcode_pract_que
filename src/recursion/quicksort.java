package recursion;

public class quicksort {
    public  static void display(int arr[])
    {
        for(int i:arr)
        {
            System.out.println(i+"");
        }
        System.out.println();
    }
    public static  void quecksort(int arr[],int st,int end)
    {
        if(st>=end)
        {
            return ;
        }
     int pIndex=partition(arr,st,end);
        quecksort(arr,st,pIndex-1);
        quecksort(arr,pIndex+1,end);
    }
    public  static  int  partition(int arr[],int st,int end)
    {
        int pivot= arr[end];
        int i = st-1;
        for(int j=st;j<end;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp= pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return  i;

    }

    public static void main(String[] args) {
        int arr[]= {6 ,3,9, 5, 2, 8 };
        display(arr);
        quecksort(arr,0, arr.length-1);
        display(arr);


    }
}
