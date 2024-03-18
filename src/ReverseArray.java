import java.util.Scanner;

public  class ReverseArray
{
    public static int[] arrrev(int[] arr1, int n)
    {



        int j = n;
        for(int i=0;i<n/2;i++)
        {
             int  temp = arr1[i];
             arr1[i]=arr1[n-1-i];
             arr1[n-1-i]= temp;
        }
        return arr1;


    }

    public static void main(String[] args) {

        Scanner sc= new Scanner( System.in);
        int n = sc.nextInt();
        int arr1[]=  new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }

        int arr3[]=arrrev(arr1,n);
        for(int i=0 ;i<n;i++)
        { System.out.println(arr3[i]);

        }




    }




}
