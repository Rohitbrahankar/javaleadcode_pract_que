package Array;

public class printallsubarray {

    public static void main(String[] args) {
        int arr[]= {6 ,7 ,5 ,9 };

        int n = arr.length;

        for(int i =0;i< n;i++)
        {
             for(int j =i ;j< n;j++)
             {
                  for(int k =i ;k<=j;k++)
                  {
                      System.out.print(arr[k]);
                  }
                 System.out.println("");
             }
        }
    }
}
