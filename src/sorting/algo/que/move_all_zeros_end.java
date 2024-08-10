package sorting.algo.que;
//moves all the zeros at end without using extra space
public class move_all_zeros_end {
    public  static  void  movezeros(int arr[])//start
    {// move zero to front
        int n= arr.length;
        for(int i=0 ; i<n; i++)//6
        {
            for(int j = n -1;j>i+0 ;j--)//0
            {
                if(arr[j]==0 && arr[j-1]!=0)//
                {
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;

                }
            }
        }

    }
    public  static  void  movezerosatend(int arr[])
    {// move zero to front
        int n= arr.length;
        for(int i=0 ; i<n-1; i++)//4
        {
            for(int j =0;j<n-i-1 ;j++)//0
            {
                if(arr[j]==0  && arr[j+1]!=0)//
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={0 ,5,0,3,4,0,2};
        movezeros(arr);
        for(int i: arr)
        {
            System.out.println(i +"  ");

        }
        System.out.println(" ");
        movezerosatend(arr);
        for(int i: arr)
        {
            System.out.println(i +"  ");
        }
    }

}
