package sorting.algo;

public class bubbles_sort {
    public  static  void bubblesort(int ar[])
    {
        int n= ar.length;
        for(int i=0 ; i<n-1 ;i++)
        {
            for(int j=0 ; j< n-i-1; j++)
            {
                if(ar[j] > ar[j+1])// check the number is greater or small
                {
                    int temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]= temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int ar[]={3,4,6,8,9,1,2,9};
        bubblesort(ar);
        for(int i :ar)//for each loop
        {
            System.out.println(i +" ");
        }
    }
}
