package sorting.algo.que;

public class sortin_lecsicographicalorder {
    public static void sortorder(String arr[])
    {
        int n = arr.length;
        for(int i=0; i<n-1 ;i++)
        {
            int  min_index = i;
            for(int j =i+1 ; j<n ;j++)
            {
               if(arr[j].compareTo(arr[min_index]) <   0)
               {
                   min_index= j;
               }
            }
           String temp = arr[i];
            arr[i]= arr[min_index];
            arr[min_index]= temp;


        }

    }
    public static void main(String[] args) {
        String arr[]={"kiviwi","apple","mango","ananas"};
        sortorder(arr);
        for(String i: arr)
        {
            System.out.println(i+" ");
        }
    }
}
