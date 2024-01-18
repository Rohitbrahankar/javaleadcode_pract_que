import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("element of an array :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i,j=1;

        for( i=1;i<n;i++)
        {
            if(arr[j]!=arr[i])
            {
                arr[j]=arr[i];
                j++;

            }

        }
        for(j=0 ;j<n-1;j++)
        {
            System.out.println(arr[j]);
        }




    }
}
